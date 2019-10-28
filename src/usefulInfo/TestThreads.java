package usefulInfo;

public class TestThreads {

        static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable
        static AffableThread mSecondThread;

        public static void main(String[] args) throws InterruptedException {
            mThing = new SomeThing();
            mSecondThread = new AffableThread();    //Создание потока "mSecondThread"
            
            Thread myThready = new Thread(mThing);	//Создание потока "myThready"
            myThready.setName("Thread-1-Runnable");

            myThready.start();				//Запуск 1-го потока
            mSecondThread.start();          // Запуск 2-го потока
            System.out.println(myThready.getName());
            System.out.println(mSecondThread.getName());

            try {
                System.out.println(mSecondThread.getState());
                myThready.join();
                System.out.println(Thread.currentThread());
//                System.out.println(myThready.isAlive());
//                myThready.sleep(1000);
            } catch(InterruptedException ignored) { }
        //    mSecondThread.wait(1000);
            System.out.println(mSecondThread.getState());
            System.out.println("Главный поток завершён...");
        }

}

class SomeThing  implements Runnable		//(содержащее метод run())
{
    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока 'implements Runnable' !");
    }
}

class AffableThread extends Thread
{
    @Override
    public void run()	//Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока 'extends Thread' !");
    }
}