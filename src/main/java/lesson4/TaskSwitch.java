package lesson4;

import java.util.Scanner;

public class TaskSwitch {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - пн");
        System.out.println("2 - вт");
        System.out.println("3 - ср");
        System.out.println("4 - чт");
        System.out.println("5 - пт");
        System.out.println("6 - сб");
        System.out.println("7 - вс");
        System.out.println("Введите номер дня недели:");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1 : System.out.println("пн"); break;
            case 2 : System.out.println("вт"); break;
            case 3 : System.out.println("ср"); break;
            case 4 : System.out.println("чт"); break;
            case 5 : System.out.println("чт"); break;
            case 6 : System.out.println("чт"); break;
            case 7 : System.out.println("чт"); break;

            default : System.out.println("нет такого дня недели");
        }

    }
}
