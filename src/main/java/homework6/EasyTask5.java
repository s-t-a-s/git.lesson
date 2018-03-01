package homework6;

public class EasyTask5 {
    public static void main(String[] args) {
        int[] myArrey = {4, -5, 0, 6, 8, 100, -5, -200, 6, 1};
        int sum = 0;
        if (myArrey.length !=0) {
            for (int i:myArrey)
                sum+=i;
            System.out.print("Среднее арифметическое данного массива равняется "+ (double)sum/myArrey.length);
        }
    }
}
