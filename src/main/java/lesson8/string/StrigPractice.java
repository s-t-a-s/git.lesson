package lesson8.string;

public class StrigPractice {

    public static void main (String [] args){
       int a = 100;
       double b = 200.00;
       long c = 300;
       boolean d = true;


        String s1 = String.valueOf(a);
        System.out.println(a);
        String s2 = String.valueOf(b);
        System.out.println(b);
        String s3 = String.valueOf(c);
        System.out.println(c);
        String s4 = String.valueOf(d);
        System.out.println(d);


        String s11 = "100";
        a = Integer.valueOf(s11);
        System.out.println(a);
        String s21 = "200.00";
        b = Double.valueOf(s21);
        System.out.println(b);
        String s31 = "300";
        c = Long.valueOf(s31);
        System.out.println(c);
        String s41 = "true";
        d = Boolean.valueOf(s41);
        System.out.println(d);

    }
}
