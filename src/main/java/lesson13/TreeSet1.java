package lesson13;

import org.testng.annotations.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {

        Set<String> countrySet = new TreeSet<>();
        countrySet.add("Россия");
        countrySet.add("Франция");
        countrySet.add("Гондурас");
        countrySet.add("Кот-Д'Ивуар"); // любимая страна всех котов
        System.out.println(countrySet);
        System.out.println(countrySet.size());
//        countrySet.clear();
        System.out.println(countrySet);
        System.out.println(countrySet.isEmpty());
        Set<String> countrySet1 = new TreeSet<>();
        countrySet1.add("Гондурас");
        countrySet1.add("ww");
        countrySet1.add("ee");
        countrySet1.add("rr");
        countrySet.addAll(countrySet1);
        System.out.println(countrySet);
        System.out.println(countrySet.isEmpty());
    }
}
