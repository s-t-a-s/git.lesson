package homework4;

public class Exercise4 {
    public static void main(String[] args) {
        String name1 = new String("Вася");
        String name2 = new String("Вася");

        System.out.println("Одного человека зовут " + name1);
        System.out.println("Второго человека зовут " + name2);


        if (name1.equals(name2)) {
            System.out.println("Эти люди являются тезками");
        } else
            System.out.println("Эти люди не являются тезками");
    }

}
