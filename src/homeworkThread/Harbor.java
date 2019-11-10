package homeworkThread;

import homework3.Ship;
import sun.misc.Queue;

import java.util.*;
import java.util.concurrent.*;

public class Harbor implements Runnable{
    private volatile int counter = 0;
    private Ship data;
    public static final Exchanger<Parcel> EXCHANGER = new Exchanger<>(); // создаем обменник с типом Parcel
    Parcel parcel;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println();
            System.out.println("Корабли меняются грузом!");
            parcel = EXCHANGER.exchange(parcel);
           // parcels[1] = EXCHANGER.exchange(parcels[1]);         //   System.out.println(Thread.currentThread());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }


//    public synchronized void add(E e) {
//        while (this.getCounter() > 2) {
//            System.out.println("Извините порт перегружен, " + Thread.currentThread().getName() + " ожидает очереди когда произведётся отгрузка из порта");
//            try {
//                wait();
//            } catch (InterruptedException e1) {
//                System.out.println("итеррапт перехвачен");
//            }
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e3) {
//            e3.printStackTrace();
//        }
//       // this.data.add(e);
//        counter++;
//        System.out.println(Thread.currentThread().getName() + " Доставил груз в порт, текущая загруженность порта " + this.getCounter() + " из 2");
//        notifyAll();
//    }
//
//    public synchronized E del() {
//        while (this.data.size() == 0) {
//            System.out.println("Извините, в порту груз отсутствует, " + Thread.currentThread().getName() + " ожидает очереди когда груз поступит в порт");
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("итеррапт перехвачен");
//            }
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        E rsl = this.data.poll();
//        System.out.println(Thread.currentThread().getName() + " Произвёл отгрузку из порта, текущая заполненность порта " + this.data.size() + " из 3");
//        notifyAll();
//        return rsl;
//    }







}


