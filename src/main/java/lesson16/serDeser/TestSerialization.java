package lesson16.serDeser;

import lesson14.Movie;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class TestSerialization {


    @Test
    public void serializeTest(){

        MyStorage myStorage = new MyStorage();
        myStorage.name = "Jack";
        myStorage.age = 15;
        SerializationWorker.serializeStorage(myStorage, "storage");


       /* Movie movie = new Movie();
        movie.title = "JACK";
        movie.rating = 9.0;
        List<Movie> list = new ArrayList<>();
        list.add(movie);
        SerializationWorker.serializeStorage(list, "movies");*/

    }


    @Test
    public void deserializeTest(){
        MyStorage myStorage = (MyStorage) SerializationWorker.deserialzeStorage("storage");
        System.out.println(myStorage.name);
        /*List<Movie> list = (List<Movie>) SerializationWorker.deserialzeStorage("movies");
        System.out.println(list);*/
    }



}
