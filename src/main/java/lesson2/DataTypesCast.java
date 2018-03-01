package lesson2;

public class DataTypesCast {

    public static void main(String[] args) {

        int i = 60;
        long lo = i;
        short s = (short) lo;
        System.out.println(s);
        //Пример как узнать какому числу соответствует символ
        char ch = 'J';
        int intCh = (int) ch;
        System.out.println("J corresponds with " + intCh);


        double b = 2.6;
        int c = (int) (0.5 + b); // можно применять к целым выражениям
        System.out.println(c); // выведет 3
        System.out.println((int)9.69); // выведет 9
        System.out.println((int)'A'); // выведет 65 — код символа «A»
        System.out.println((double)3); // выведет 3.0

    }
}
