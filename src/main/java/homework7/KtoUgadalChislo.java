package homework7;

import java.util.Scanner;

public class KtoUgadalChislo {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        System.out.println("Введите целое число в диапазоне от 0 до 100.");
        Scanner x1input = new Scanner(System.in);
        int x1 = x1input.nextInt();
        int x2 = (int) (Math.random() * 100);

        if (Math.abs(x - x1) < Math.abs(x - x2)) {
            System.out.println("Результат: Победил Игрок! Программа = " + x + ", Игрок = " + x1 + ", Компьютер 1 = " + x2);
        } else if (Math.abs(x - x1) == Math.abs(x - x2)) {
            System.out.println("Результат: Ничья! Программа = " + x + ", Игрок = " + x1 + ", Компьютер 1 = " + x2);
        } else if (Math.abs(x - x1) > Math.abs(x - x2)) {
            System.out.println("Результат: Победил Копьютер 1! Программа = " + x + ", Игрок = " + x1 + ", Компьютер 1 = " + x2);
        }
    }
}