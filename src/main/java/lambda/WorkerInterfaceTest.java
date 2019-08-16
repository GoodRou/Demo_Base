package lambda;

/**
 * @ClassName WorkerInterfaceTest
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/15 15:19
 * @Version 1.0
 **/
public class WorkerInterfaceTest
{
    public static void execute(WorkerInterface worker)
    {
        worker.doSomeWork();
    }

    public static void main(String[] args)
    {
        execute(new WorkerInterface()
        {
            @Override
            public void doSomeWork()
            {
                System.out.println("111");
            }
        });
        execute(() -> System.out.println("222"));
    }
}
