package lesson8.string;

public class StringsEquals {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";
        if (s1.equals(s2)){  // оператор == неприменим для строк
            System.out.println("Strings are equals");
        }
    }
}
