package homework6;

import java.util.Scanner;

public class TranslitBack {

    public static void main(String[] args) {
        char[] cyr = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ы', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};
        char[] lat = {'A', 'B', 'V', 'G', 'D', 'E', 'Y', 'J', 'Z', 'I', 'Y', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'F', 'H', 'C', 'C', 'S', 'S', 'Y', 'E', 'Y', 'Y', 'a', 'b', 'v', 'g', 'd', 'e', 'e', 'j', 'z', 'i', 'y', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'f', 'h', 'ц', 'ч', 'ш', 'щ', '"', 'y', '"', 'e', 'y', 'y', ' '};

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char inPut[] = s.toCharArray();

        for (char i : inPut) {

            for (int j = 0; j < cyr.length; j++) {
                if (i == cyr[j])
                    System.out.print(lat[j]);
            }
            for (int j = 0; j < lat.length; j++) {
                if (i == lat[j])
                    System.out.print(cyr[j]);
            }

        }

    }
}
