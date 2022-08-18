package com.weixin.tuisong.job;

import com.weixin.tuisong.util.Pusher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName JobWorker
 * @Description TODO
 * @Author Ljc
 * @Date 2022/8/2 16:00
 */
@Component
public class JobWorker {

    //要推送的用户openid
    private static String openId = "";

    @Scheduled(cron = "0 0 8 * * ?")
    public void goodMorning() {
        Pusher.push(openId);
    }

    @Scheduled(cron = "0 0 10-18/1 * * ?")
    public void goodLook() {
        Pusher.push(openId);
    }

}
