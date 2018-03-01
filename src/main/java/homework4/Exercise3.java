package homework4;

public class Exercise3 {
        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            System.out.println("число a = " + a);
            System.out.println("число b = " + b);
            System.out.println("число c = " + c);
            System.out.println("число d = " + d);
            System.out.println("число e = " + e);

            //наименьшее число
            if (a<=b && a<=c && a<=d && a<=e) {
                System.out.println("среди заданных чисел наименьшим является число 'a'");
            }
            if (b<=a && b<=c && b<=d && b<=e) {System.out.println("среди заданных чисел наименьшим является число 'b'");
            }
            if (c<=b && c<=a && c<=d && c<=e) {
                System.out.println("среди заданных чисел наименьшим является число 'c'");
            }
            if (d<=b && d<=c && d<=a && d<=e) {
                System.out.println("среди заданных чисел наименьшим является число 'd'");
            }
            if (e<=a && e<=b && e<=c && e<=d) {
                System.out.println("среди заданных чисел наименьшим является число 'e'");
            }
            //наибольшее число
            if (a>=b && a>=c && a>=d && a>=e) {
                System.out.println("среди заданных чисел наибольшим является число 'a'");
            }
            if (b>=a && b>=c && b>=d && b>=e) {System.out.println("среди заданных чисел наибольшим является число 'b'");
            }
            if (c>=b && c>=a && c>=d && c>=e) {
                System.out.println("среди заданных чисел наибольшим является число 'c'");
            }
            if (d>=b && d>=c && d>=a && d>=e) {
                System.out.println("среди заданных чисел наибольшим является число 'd'");
            }
            if (e>=a && e>=b && e>=c && e>=d) {
                System.out.println("среди заданных чисел наибольшим является число 'e'");
            }
        }
    }
