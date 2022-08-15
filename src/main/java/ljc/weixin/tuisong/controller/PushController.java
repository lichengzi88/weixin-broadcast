package ljc.weixin.tuisong.controller;

/**
 * @ClassName PushController
 * @Description TODO
 * @Author Ljc
 * @Date 2022/8/2 15:48
 */

import ljc.weixin.tuisong.util.Pusher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {
    //要推送的用户openid
    private static String mxp = "oc15U6o3MnzZn0PTPxsnOgvjoSgM";
    private static String zyd = "oc15U6oFuPZRIC35SEV4pw30RnYs";

    /**
     * 微信测试账号推送
     *
     */
    @GetMapping("/push")
    public void push() {
        Pusher.push(mxp, Pusher.templateIdZ);
    }

    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/zyd")
    public void pushZyd() {
        Pusher.push(zyd, Pusher.templateIdZ);
    }


    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/{id}")
    public void pushId(@PathVariable("id") String id) {
        Pusher.push(id, Pusher.templateIdZ);
    }
}