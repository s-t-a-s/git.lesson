package lesson16;

import okhttp3.*;

import java.io.IOException;

public class TrelloApi {

    public  static final String KEY = "c39c6d6cfe7a0a3827462cddc3b48d6c";
    public  static final String TOKEN = "8053c5185d580c28de530c1b919cf44d803b55c5e874fb715de2bd748bad9157";


    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

public String getBoardList (String boardId) throws IOException {
String url = "https://api.trello.com/1/boards/"+boardId+"/lists?cards=all&key="+KEY+"&token="+TOKEN;
String response = get(url);
return response;


    }

}
