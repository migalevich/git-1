package threadsTest;

import javax.naming.InsufficientResourcesException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Transfer implements Callable<Boolean> {
    private static final long WAIT_SEC = 3;
    int id;
    Account accountFrom;
    Account accountTo;
    private int amount;
    CountDownLatch latch;

    public Transfer(int id, Account accountFrom, Account accountTo, int amount, CountDownLatch latch) {
        this.id = id;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
       this.latch = latch;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Account acc1, Account acc2, int amount)
    @Override
    public Boolean call() throws Exception {
        System.out.println("Start work transfer = "+id);
        latch.await();
        if (accountFrom.getBalance() < amount) throw new InsufficientResourcesException();
        if (accountFrom.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
            System.out.println("accountFrom name ="+accountFrom.getName());
            System.out.println("currentThread = "+ Thread.currentThread());
            System.out.println(Thread.holdsLock(accountFrom));
            System.out.println(Thread.holdsLock(accountFrom));
            try {
                if (accountFrom.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS))
                    try {
                        System.out.println("Transfer id = " + id );
                        Random randNumber = new Random();
                      //  Thread.sleep(randNumber.nextInt(6));
                        accountFrom.withdraw(amount);
                        accountFrom.deposit(amount);
                    } finally {
                        accountFrom.getLock().unlock();
                    }
                return true;
            } finally {
                accountFrom.getLock().unlock();
            }
        } else {
            System.out.println("Error waiting lock");
            return false;
        }
    }
}
