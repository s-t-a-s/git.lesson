package lesson12;

public class WeekDayWorker {

    public static void main(String[] args) {

        sendMessage(WeekDay.FRIDAY);
    }

    public static void sendMessage(WeekDay weekDay){
        System.out.println("FOR DAY "+weekDay+" Number is: "+weekDay.getDayInt());
    }
}
