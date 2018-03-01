package lesson9;

public class MethodsExample {

    public static void main (String[] args) {
        Cat kitty = new Cat();
        kitty.meow();
        kitty.meow(3);
        kitty.meow(3, 2);
        kitty.meow(4500.25);

        int square = getSquare();
        System.out.println(square);
    }

    public static int getSquare() {
        return 3 * 5;
    }
    public int getSquare(int a, int b){
        return a*b;
    }


}
