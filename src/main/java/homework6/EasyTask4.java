package homework6;

public class EasyTask4 {
    public static void main(String[] args) {
        int[] myArrey = {4, -5, 0, 6, 8};
        int min = myArrey[0];
        int max = myArrey[0];
        int tempi1 = 0;
        int tempi2 = 0;
        int temp3;


        for (int i = 0; i < 5; i++) {

            if (myArrey[i] < min) {
                min = myArrey[i];
                tempi1 = i;
            }

           if (myArrey[i] > max) {
                max = myArrey[i];
                tempi2 = i;
            }

        }

        temp3 = myArrey[tempi1];
        myArrey[tempi1] = myArrey[tempi2];
        myArrey[tempi2] = temp3;

        for (int i = 0; i < 5; i++) {
            System.out.print(myArrey[i]+", ");


        }
    }
}