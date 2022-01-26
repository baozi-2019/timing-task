package time;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;

/**
 * 作者：鲍庆洋
 * 时间：2021/7/8 15:58
 * 描述：
 */
public class QuartzTest {
    public static void main(String[] args) {
        try {
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
//            实验1
//            JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
//                    .withIdentity("hello job")
//                    .build();
//
//            Trigger trigger = TriggerBuilder.newTrigger()
//                    .withIdentity("trigger1", "group1")
//                    .startAt(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-7-8 16:38:30"))
//                    .build();

//            实验二
            JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("test2")
                    .build();

            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("CronTrigger", "group2")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
                    .build();

            scheduler.scheduleJob(jobDetail, trigger);

            scheduler.start();

//            Thread.sleep(1000 * 20);
//
//            scheduler.shutdown(true);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
