package homework9;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator result = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double x;
        double y;
        int j;
        if (input.contains("+")) {
            j = input.indexOf('+');
            x = Double.valueOf(input.substring(0, j));
            y = Double.valueOf(input.substring(j+1));
            result.calcPlus(x, y);
        } else if (input.contains("-")) {
            j = input.indexOf('-');
            x = Double.valueOf(input.substring(0, j));
            y = Double.valueOf(input.substring(j+1));
            result.calcMinus(x, y);
        } else if (input.contains("*")) {
            j = input.indexOf('*');
            x = Double.valueOf(input.substring(0, j));
            y = Double.valueOf(input.substring(j+1));
            result.calcMultiply(x, y);
        } else if (input.contains("/")) {
            j = input.indexOf('/');
            x = Double.valueOf(input.substring(0, j));
            y = Double.valueOf(input.substring(j+1));
            result.calcDivide(x, y);
        }

    }
    void calcPlus(double x, double y){
        System.out.println("Результат равен " + (x+y));
    }
    public void calcMinus(double x, double y){
        System.out.println("Результат равен " + (x-y));
    }
    public void calcMultiply(double x, double y){
        System.out.println("Результат равен " + (x*y));
    }
    public void calcDivide(double x, double y){
        System.out.println("Результат равен " + (x/y));
    }

}
