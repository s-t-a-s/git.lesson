package lesson13;

import org.testng.annotations.Test;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("StarMors1", 8.3);
        map.put("StarMors2", 9.0);
        map.put("StarMors3", 5.7);

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {

            //получить ключ
            String key = entry.getKey();
            //получить значение
            Double value = entry.getValue();
            System.out.println("Movie title: " + key + " Rating: " + value);
        }

    }

    @Test
    public void listIterator() {
        List<String> sexNames = new ArrayList<>();
        sexNames.add("Slava");
        sexNames.add("Jack");
        sexNames.add("Jessika");
        sexNames.add("Kolya");
        sexNames.add("Kolya");

//        //Не правильный
//        @Test
//        public void listIterator(){
//            List<String > sexNames = new ArrayList<>();
//            sexNames.add("Slava");
//            sexNames.add("Jessika");
//            Iterator
//            for (String s: sexNames){
//                if (s.contains("J")){
//                    sexNames.remove(s);
//                }
//            }
//        }


        System.out.println("Original: " + sexNames);
        Iterator<String> iterator = sexNames.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("J")) {
                iterator.remove();
            }
        }
    }
}
