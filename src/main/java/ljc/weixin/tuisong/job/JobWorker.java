package ljc.weixin.tuisong.job;

import ljc.weixin.tuisong.util.Pusher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author Ljc
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "oc15U6o3MnzZn0PTPxsnOgvjoSgM";

    private String formatter = "yyyy-MM-dd HH:mm:ss";

    @Scheduled(cron = "0 0 8 * * ?")
    public void goodMorning(){
        Pusher.push(openId,Pusher.templateIdZ);
        System.out.println("早上好发送成功，当前时间 ===> " + format(new Date(), formatter));
    }


    @Scheduled(cron = "0 0 14 * * ?")
    public void goodAfter(){
        Pusher.push(openId,Pusher.templateIdX);
        System.out.println("下午好发送成功，当前时间 ===> " + format(new Date(), formatter));
    }

    @Scheduled(cron = "0 0/30 10-18 ? * MON-FRI")
    public void goodLook(){
        Pusher.push(openId,Pusher.templateIdL);
        System.out.println("提醒喝水发送成功，当前时间 ===> " + format(new Date(), formatter));
    }

    public static String format(Date date, String formatter) {
        Assert.notNull(date, "日期不能为空");
        Assert.notNull(formatter, "格式化参数不能为空");
        SimpleDateFormat sdf = new SimpleDateFormat(formatter);
        return sdf.format(date);
    }
}
