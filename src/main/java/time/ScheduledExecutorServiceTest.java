package time;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 作者：鲍庆洋
 * 时间：2021/7/8 15:22
 * 描述：
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("一秒一次");
        Executors.newSingleThreadScheduledExecutor()
                .scheduleAtFixedRate(runnable, 0, 2, TimeUnit.SECONDS);
    }
}
