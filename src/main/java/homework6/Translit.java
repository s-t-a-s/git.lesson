package homework6;

import java.util.Scanner;

public class Translit {
    public static void main(String[] args) {
        char[] cyr = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[] lat = {'a', 'b', 'v', 'g', 'd', 'e', 'ё', 'g', 'z', 'i', 'й',
                'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'y',
                'f', 'h', 'ц', 'ч', 'ш', 'щ', '_', 'u', '`', 'e', 'ю', 'я'};

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char inPut[];
        inPut = s.toCharArray();
        for (char i:inPut){
            for(int j=0; j<cyr.length; j++){
                if(i==cyr[j])
            System.out.print(lat[j]);
            }

            }

        }



   /** {'a', 'b', 'v', 'g', 'd', 'e', 'yo', 'g', 'z', 'i', 'yi',
            'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'y',
            'f', 'h', 'tz', 'ch', 'sh', 'shch', '_', 'u', '`', 'e', 'yu', 'ya'};**/



    }