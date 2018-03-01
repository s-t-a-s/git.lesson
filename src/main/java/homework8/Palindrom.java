package homework8;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создаем новый объект класса Scanner
        String frase1 = scanner.nextLine(); //вызываем метод nextLine() объекта scanner для инициализации новой строки
        frase1 = frase1.replace(" ", ""); // убираем все пробелы в строке с помощью вызова метода replace

        char[] fraseTemp = frase1.toCharArray(); // строку в массив символов

        String frase2 = "";//инициализируем новую строку и присваиваем ей пустое значение

        for (int i = fraseTemp.length-1; i>=0; i--) {//перебираем массив символов в обратном порядке
            frase2 += fraseTemp[i]; //и составляем из полученных элементов строку два
        }

        if (frase1.equalsIgnoreCase(frase2)) {//сравниваем строки игнорируя ргистр символов
            System.out.println("Данная фраза является палиндромом");
        }
        else System.out.println("Данная фраза НЕ является палиндромом");
    }
}