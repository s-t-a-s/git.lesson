package homework4;

public class Exercise1and2 {
    public static void main(String[] args) {
        int a = 8;
        int b = -11;
        int c = 7;
        int d = 8;
        System.out.println("число a = " + a);
        System.out.println("число b = " + b);
        System.out.println("число c = " + c);
        System.out.println("число d = " + d);

        //Exercise1
        if (a <= b && a <= c && a <= d) {
            System.out.println("среди заданных чисел наименьшим является число 'a'");
        }
        if (b <= a && b <= c && b <= d) {
            System.out.println("среди заданных чисел наименьшим является число 'b'");
        }
        if (c <= b && c <= a && c <= d) {
            System.out.println("среди заданных чисел наименьшим является число 'c'");
        }
        if (d <= b && d <= c && d <= a) {
            System.out.println("среди заданных чисел наименьшим является число 'd'");
        }
        //Exercise2
        int max = 0;
        if (a >= b && a >= c && a >= d) {
            max++;
        }
        if (b >= a && b >= c && b >= d) {
            max++;
        }
        if (c >= b && c >= a && c >= d) {
            max++;
        }
        if (d >= b && d >= c && d >= a) {
            max++;
        }
        System.out.println("количество максимальных чисел равняется " + max );
    }
}