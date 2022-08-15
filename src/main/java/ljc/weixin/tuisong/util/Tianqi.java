package ljc.weixin.tuisong.util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName Tianqi
 * @Description TODO
 * @Author Ljc
 * @Date 2022/8/2 16:45
 */
public class Tianqi {
    private static String ak = "c2krpmnsMGjiDjmUnYMLHeICR0meZ2y6";
    public static String district_id = "430111";// 长沙

    public static String district_id_jia = "510800";// 广元

    public static JSONObject getNanjiTianqi(String district_id) {
        String result = null;
        JSONObject today = new JSONObject();
        try {
            result = HttpUtil.getUrl("https://api.map.baidu.com/weather/v1/?district_id=" + district_id + "&data_type=all&ak=" + ak);
            JSONObject jsonObject = JSONObject.parseObject(result);
            if (jsonObject.getString("message").equals("success")) {
                JSONArray arr = jsonObject.getJSONObject("result").getJSONArray("forecasts");
                today = arr.getJSONObject(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return today;
    }

    public static void main(String[] args) {
        System.out.println(getNanjiTianqi(district_id));
    }
}
