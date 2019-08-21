package thread;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/20 10:38
 * @Version 1.0
 **/
public class ThreadDemo extends Thread
{
    private String name;
    static final int x = 1;


    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            for (long k = 0; k < 100000000; k++) ;
            System.out.println(this.getName() + " :" + i);
        }
    }

    public ThreadDemo(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        DoSomeThing d1 = new DoSomeThing("rr");
        DoSomeThing d2 = new DoSomeThing("gg");
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
//        t1.start();
//        t2.start();

        Runnable r1 = () ->
        {
            System.out.println("123");
        };
        Thread t3 = new Thread(r1);
//        t3.start();

        ThreadDemo tt1 = new ThreadDemo("rr");
        ThreadDemo tt2 = new ThreadDemo("gg");
//        tt1.start();
//        tt2.start();



        ThreadB b = new ThreadB();
        b.start();
//        线程A拥有b对象上的锁。线程为了调用wait()或notify()方法，该线程必须是那个对象锁的拥有者
        synchronized (b)
        {
            try
            {
                System.out.println("wait finsh b");
//                当前线程A等待
                b.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("b对象计算的总和是：" + b.total);
        }


    }
}

class ThreadA
{

}

class ThreadB extends Thread
{
    int total;

    @Override
    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 101; i++)
            {
                total += i;
            }
//            （完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
            notify();
        }
    }
}
