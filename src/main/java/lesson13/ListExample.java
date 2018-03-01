package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    @Test
    public void azazaz(){
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        LinkedList<String> stringLinkedList = new LinkedList<>();
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("11");
        stringArrayList.add("12");
        stringArrayList.add("13");
        stringArrayList.add("14");
        stringArrayList.add("15");
        System.out.println(stringArrayList);
    }
}
