package threadsTest;

import javax.naming.InsufficientResourcesException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Operations {
    private static final long WAIT_SEC = 1;

    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a1 = new Account(1000, "a");
        final Account a2 = new Account(2000, "b");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                   // transfer(a1, a2, 500);
                    transfer2(a1,a2,500);
                    System.out.println(">> transfer and a1 -> a2 ");
                    System.out.println("R balance a1 = " + a1.getBalance());
                    System.out.println("R balance a2 = " + a2.getBalance());
                } catch (InsufficientResourcesException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //transfer(a2, a1, 300);
        transfer2(a2, a1, 300);
        System.out.println(">> transfer and a2 -> a1 ");
        System.out.println("M balance a1 = " + a1.getBalance());
        System.out.println("M balance a2 = " + a2.getBalance());
    }

    /* Синхронизация c использованием synchronize */
    private static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {
        if (acc1.getBalance() < amount) throw new InsufficientResourcesException();
        synchronized (acc1) {
            System.out.println(acc1.getName());
            System.out.println("First synchr");
            System.out.println(Thread.currentThread());
            System.out.println(Thread.holdsLock(acc1));
            System.out.println(Thread.holdsLock(acc2));
            try {
                System.out.println("sleeep");
                System.out.println(Thread.currentThread());
                Thread.sleep(1000);
            } catch
            (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (acc2) {
                System.out.println("Second synchr");
                System.out.println(Thread.currentThread());
                acc1.withdraw(amount);
                acc2.deposit(amount);
            }
        }
    }

/* Синхронизация объектом класса ReentrantLock */
    private static void transfer2(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {
        if (acc1.getBalance() < amount) throw new InsufficientResourcesException();
        if (acc1.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
            System.out.println(acc1.getName());
            System.out.println(Thread.currentThread());
            System.out.println(Thread.holdsLock(acc1));
            System.out.println(Thread.holdsLock(acc2));
            try {
                if (acc2.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS))
                    try {
                        Random randNumber = new Random();
                        Thread.sleep(randNumber.nextInt(6));
                        acc1.withdraw(amount);
                        acc2.deposit(amount);
                    } finally {
                        acc2.getLock().unlock();
                    }
            } finally {
                acc1.getLock().unlock();
            }
        } else {
            System.out.println("Error waiting lock");
        }
    }

}
