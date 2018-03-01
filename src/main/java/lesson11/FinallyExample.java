package lesson11;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            System.out.println("inside main");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("main's finally");
        }

    }
}
