package homework2;

public class Exercise3 {
    public static void main(String[] args){
        double x = 9.595;
        if (x*10%10 < 5) System.out.println((int)x);
        if (x*10%10 >= 5) System.out.println((int)++x);
    }
}


