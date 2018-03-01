package homework4;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        System.out.println("Чтобы узнать время года, введите порядковый номер месяца (число от 1 до 12):");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month) {
            case 1 : System.out.println("Зима"); break;
            case 2 : System.out.println("Зима"); break;
            case 12 : System.out.println("Зима"); break;
            case 3 : System.out.println("Весна"); break;
            case 4 : System.out.println("Весна"); break;
            case 5 : System.out.println("Весна"); break;
            case 6 : System.out.println("Лето"); break;
            case 7 : System.out.println("Лето"); break;
            case 8 : System.out.println("Лето"); break;
            case 9 : System.out.println("Осень"); break;
            case 10 : System.out.println("Осень"); break;
            case 11 : System.out.println("Осень"); break;

            default: System.out.println("Неверно введен порядковый номер месяца"); break;
        }
    }
}
