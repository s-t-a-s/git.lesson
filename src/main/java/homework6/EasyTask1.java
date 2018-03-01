package homework6;

public class EasyTask1 {

    public static void main (String[] args){
        int[] myArrey = new int[10];
        for(int i = 0; i < 10; i++){
            myArrey[i] = 2*i+1;
        }
        for(int i = 0; i < 10; i++){
            System.out.print(myArrey[i]+", ");
        }
    }
}
