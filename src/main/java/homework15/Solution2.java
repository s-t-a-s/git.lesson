package homework15;

/*
Задача: Вводить с клавиатуры строки до тех пор пока не будет введена пустая строка,
 после чего вывести строки в отсортированном порядке (алфавитном)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        //заполните список строками при помощи reader.readLine();
        while (true) {
            String s = reader.readLine();
            if(s.equals("")) {
                break;
            } else
                list.add(s);
        }

        Collections.sort(list); //метод для сортировки списка

        //вывести список в отсортированном порядке
        for (String strings : list) {
            System.out.println(strings);
        }
    }

//    public static List<String> mySort(List<String> list) {
//        //реализуйте свой алгоритм сортировки списка при помощи  метода isGreaterThan(String a, String b)
//
//
//    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b){
        return a.compareTo(b) > 0;
    }
}