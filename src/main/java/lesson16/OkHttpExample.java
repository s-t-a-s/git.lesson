package lesson16;

//import okhttp3.*;
//
//import java.io.IOException;
//
//public class OkHttpExample {
//
//    OkHttpClient client = new OkHttpClient();
//
//    public String post(String url, String json) throws IOException {
//        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
//        Request request = new Request.Builder().url(url).post(body).build();
//        Response response = client.newCall(request).execute();
//        return response.body().string();
//    }
//
//}


import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;


public class OkHttpExample {

    OkHttpClient client = new OkHttpClient();

    String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");



    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String postFormBody(){
        new FormBody.Builder().add("", "").add("", "");
        return "";
    }

    @Test
    public void testRequest() throws IOException {
        String response = post("https://httpbin.org/post", "{\"param\":\"jack\"}");
        System.out.println(response);
    }

}