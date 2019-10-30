package threadsTest;

import sun.misc.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private String name;
    private ReentrantLock lock;

    public Account(int balance, String name) {
        this.balance = balance;
        this.name = name;
        this.lock = new ReentrantLock();
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance +=  amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }
}
