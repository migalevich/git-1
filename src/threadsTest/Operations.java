package threadsTest;

import javax.naming.InsufficientResourcesException;

public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a1 = new Account(1000, "a");
        final Account a2 = new Account(2000, "b");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(a1, a2, 500);
                    System.out.println(">> transfer and a1 -> a2 ");
                    System.out.println("R balance a1 = "+a1.getBalance());
                    System.out.println("R balance a2 = "+a2.getBalance());
                } catch (InsufficientResourcesException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        transfer(a2, a1, 300);
        System.out.println(">> transfer and a2 -> a1 ");
        System.out.println("M balance a1 = "+a1.getBalance());
        System.out.println("M balance a2 = "+a2.getBalance());
    }

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
}
