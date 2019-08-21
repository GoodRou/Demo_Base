package thread;

import lombok.Data;

/**
 * @ClassName DoSomeThing
 * @Description TODO
 * @Author GOODRR
 * @Date 2019/8/20 10:51
 * @Version 1.0
 **/
@Data
public class DoSomeThing implements Runnable
{
    private String name;

    public DoSomeThing(String name)
    {
        this.name = name;
    }


    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 1000000; j++)
            {
                System.out.println(name + j);
            }
        }
    }
}
