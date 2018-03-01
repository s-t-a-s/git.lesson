package homework6;

public class EasyTask2_3 {
    public static void main(String[] args) {
        int[] nArrey = {0, 100, 99, 0, -77, -77, 7, 1};
        int min = nArrey[0];
        for (int i = 0; i < nArrey.length; i++) {
            if (nArrey[i] < min)
                min = nArrey[i];
        }
        System.out.print("Минимальные значения в массиве: ");
        for (int i = 0; i < nArrey.length; i++) {
            if (nArrey[i] == min)
                System.out.print(nArrey[i] + " ");
        }
        System.out.println();
        int max = nArrey[0];
        for (int i = 0; i < nArrey.length; i++) {
            if (nArrey[i] > max)
                max = nArrey[i];
        }
        for (int i = 0; i < nArrey.length; i++) {
            if (nArrey[i] == max)
                System.out.print("Максимальные значения в массиве: " + nArrey[i] + " ");
        }
    }
}
