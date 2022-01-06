package com.day01.demo1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class testPost {

    public static void main(String[] args) {

        while (true){
            String code = random16Code();
            sendGet("http://103.41.65.104/index.php/vip/index/dispose.html","t=tjcdk&Code="+code+"&qr=http://txz.qq.com/p?k=S89u9dWoFZM41ZgRvbpVUASHT*2UQEwm&f=716027609&token=AVWhkS8ytceyVnDQX9I7FWsipCLOLb5I*GG-HfHYwrTuL9A50f33AECwapz5Mx*u&Code=&client=QQ&uin=630697907&ck=uin=o0630697907;%20p_uin=o0630697907;%20pt4_token=isWmSzZbknXu-Q*Ze3UjsDlcfYISZNoTleqar2eSgyI_;%20p_skey=sXHG4vyNvFixDIT0gQtyJlmiK7MzQrsIQC0QsK4QvPE_;%20skey=@YqDObIFny;&appid=123&nick=12313");
        }

    }




    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("sQR", "{\"token\":\"AVWhkS8ytceyVnDQX9I7FWsipCLOLb5I*GG-HfHYwrTuL9A50f33AECwapz5Mx*u\",\"qr\":\"http://txz.qq.com/p?k=S89u9dWoFZM41ZgRvbpVUASHT*2UQEwm&f=716027609\",\"QRval\":\"http://txz.qq.com/p?k=S89u9dWoFZM41ZgRvbpVUASHT*2UQEwm&f=716027609\"}");
            connection.setRequestProperty("user", "{\"token\":\"AVWhkS8ytceyVnDQX9I7FWsipCLOLb5I*GG-HfHYwrTuL9A50f33AECwapz5Mx*u\",\"qr\":\"http://txz.qq.com/p?k=S89u9dWoFZM41ZgRvbpVUASHT*2UQEwm&f=716027609\",\"uin\":\"630697907\",\"ck\":\"uin=o0630697907; p_uin=o0630697907; pt4_token=isWmSzZbknXu-Q*Ze3UjsDlcfYISZNoTleqar2eSgyI_; p_skey=sXHG4vyNvFixDIT0gQtyJlmiK7MzQrsIQC0QsK4QvPE_; skey=@YqDObIFny;\",\"Nick\":\"小土\",\"TStatue\":\"0\",\"Tel\":\"该用户未绑定手机\",\"Client\":\"QQ\",\"HStatue\":\"1\",\"QQh\":\"630697907\",\"VStatue\":\"1\",\"VTime\":0,\"Time\":1639561507}");
            connection.setRequestProperty("Host", "y.qq.com.duihuan.info");
            connection.setRequestProperty("Upgrade-Insecure-Requests", "1");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static String random16Code() {
        int len = 16;
        int f = 0;
        char[] pwd = new char[len];
        for (int i = 0; i < len; i++) {
            //随机生成0，1，2三个数中的一个f，作为判断条件
            f = (int) (Math.random() * 3);
            //System.out.println(f);
            if (f == 0) {
                //生成0-9之间的随机数字
                pwd[i] = (char) ('0' + Math.random() * 10);
            } else if (f == 1) {
                //随机生成一个小写字母
                pwd[i] = (char) ('a' + Math.random() * 26);
            } else
                //随机生成一个大写字母
                pwd[i] = (char) ('A' + Math.random() * 26);
        }
        return new String(pwd);
    }

}
