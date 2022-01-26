package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 作者：鲍庆洋
 * 时间：2021/7/8 14:14
 * 描述：
 */
public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("现在：2021-7-8 14:23:00");
//            }
//        }, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2021-7-8 14:23:00"));

//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("三秒一次");
//            }
//        }, 3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("延迟三秒");
            }
        }, 3000, 1000);
    }
}
