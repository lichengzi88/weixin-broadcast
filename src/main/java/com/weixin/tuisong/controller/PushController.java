package com.weixin.tuisong.controller;

/**
 * @ClassName PushController
 * @Description TODO
 * @Author Ljc
 * @Date 2022/8/2 15:48
 */

import com.weixin.tuisong.util.Pusher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {
    //要推送的用户openid
    private static String mxp = "";
    private static String zyd = "";

    /**
     * 微信测试账号推送
     */
    @GetMapping("/push")
    public void push() {
        Pusher.push(mxp);
    }

    /**
     * 微信测试账号推送
     */
    @GetMapping("/push/zyd")
    public void pushZyd() {
        Pusher.push(zyd);
    }


    /**
     * 微信测试账号推送
     */
    @GetMapping("/push/test")
    public void pushId(String id) {
        Pusher.push(id);
    }

}