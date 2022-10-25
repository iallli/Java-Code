class ThreadClass extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Thread.");
        }
    }
}
class RunnableClass implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("Hello from Runnable.");
        }
    }
}
class A extends Thread
{
    //You can have a thread with without overriding the run() method.
}
class B extends Thread
{
    //If you overload the run() method, the method with no parameter is executed when start() method is invoked.
    public void run() {
        System.out.println("Normal Run");
    }
    public void run(int i) {
        System.out.println("Parameter Run");
    }
}
class C extends Thread
{
    public synchronized void start() {
        System.out.println("Normal Method");
    }
    public void run() {
        System.out.println("Normal Run");
    }
}
class D extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("Hello from Thread.");
        }
    }
}
class E extends Thread
{
    @Override
    public void run() {
        try{
            for (int i=0;i<10;i++)
            {
                System.out.println("Hello from Thread Interrupt.");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException Occur.");
        }
    }
}


public class Main
{
    public static void main(String[] args) throws InterruptedException {

        //Multitasking
        //Process Based Multitasking
        //Thread Based Multitasking
        //Threads
        //Multi Threads
        //Life Cycle of a Thread

        /*
        ThreadClass thread = new ThreadClass();
        System.out.println(thread.getPriority());
        thread.setPriority(9);
        System.out.println(thread.getPriority());
        thread.start();
        */

        /*
        RunnableClass runnable = new RunnableClass();
        //runnable.run();
        Thread t = new Thread(runnable);
        t.start();
         */

        /*
        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass();
//        t1.start();
//        t2.start();
        t1.run();//Output is consistent
        t2.run();
        */

        /*
        A a = new A();
        a.start();

        B b = new B();
        b.start();

        C c = new C();
        c.start();
        */

        /*
        Thread thread1 = new Thread(new RunnableClass());
        System.out.println(thread1.getName());
        thread1.setName("Ali");
        System.out.println(thread1.getName());
        */

        /*
        ThreadClass thread2 = new ThreadClass();
        thread2.start();

        for (int i=0; i<10;i++)
        {
            ThreadClass.yield();//Thread will be printed first
            System.out.println("Hello from Main.");
        }
        */

        /*
        //to check sleep() method
        ThreadClass thread3 = new ThreadClass();
        thread3.start();
        */

        /*
        ThreadClass thread4 = new ThreadClass();
        thread4.start();
        thread4.join();
        for (int i=0; i<10;i++)
        {
            System.out.println("Hello from Main.");
        }
        */

        /*
        D d = new D();
        d.start();
        d.interrupt();

        E e = new E();
        e.start();
        e.interrupt();
        */

    }
}