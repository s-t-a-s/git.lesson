package lesson12;

public enum WeekDay {

    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDY(5),
    FRIDAY(6),
    SATURDAY(7),
    SUNDAY(1);

    private int dayInt;

    WeekDay (int dayInt){

        this.dayInt = dayInt;
    }

    public int getDayInt(){

        return dayInt;
    }

}

