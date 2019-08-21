package thread;

/**
 * @ClassName TestD
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/21 13:16
 * @Version 1.0
 **/
public class TestD
{
    public static void main(String[] args)
    {
        Runnable r1 = () ->
        {
            synchronized (TestD.class)
            {
                System.out.println("enter thread1...");
                System.out.println("thread1 is waiting...");
                try
                {
                    //调用wait()方法，线程会放弃对象锁，进入等待此对象的等待锁定池
                    TestD.class.wait();
                    System.out.println("123");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("thread1 is going on ....");
                System.out.println("thread1 is over!!!");

            }
        };
        Runnable r2 = () ->
        {
            synchronized (TestD.class)
            {
                System.out.println("enter thread2....");
                System.out.println("thread2 is sleep....");
                //只有针对此对象调用notify()方法后本线程才进入对象锁定池准备获取对象锁进入运行状态。
                TestD.class.notify();
                //==================
                //区别
                //如果我们把代码：TestD.class.notify();
                // 给注释掉，即TestD.class调用了wait()方法，但是没有调用notify()
                //方法，则线程永远处于挂起状态。
                try
                {
                    //sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，
                    //但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
                    //在调用sleep()方法的过程中，线程不会释放对象锁。
                    Thread.sleep(5000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println("thread2 is going on....");
                System.out.println("thread2 is over!!!");
            }
        };

        new Thread(r1).start();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        new Thread(r2).start();
    }
}
