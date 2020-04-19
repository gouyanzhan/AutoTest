package demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultBackoffStrategy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.annotation.Target;
import java.nio.charset.Charset;

/**
 * @author Yanzhan Gou
 * @date 2020-04-16 19:23:08
 */
public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这个是用来执行get方法的
        HttpClient client = new DefaultHttpClient();
       HttpResponse response =  client.execute(get);
       result = EntityUtils.toString(response.getEntity(),"我是中国人");
        System.out.println(result);

    }

}
