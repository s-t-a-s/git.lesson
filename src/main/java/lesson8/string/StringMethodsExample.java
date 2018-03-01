package lesson8.string;

public class StringMethodsExample {
    public static void main (String [] args){
        String helloString1 = "my,string,hello,world1";
        String[] stringArray = helloString1.split(",");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
