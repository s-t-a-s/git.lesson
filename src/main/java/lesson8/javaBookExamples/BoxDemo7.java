package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo7 {

    public static void main(String[] args){
        //объявляем, выделяем память и инициализируем объекты типа Box1
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1(3, 6, 9);

        double volume;

        //получить объем первой коробки
        volume = mybox1.vol1();
        System.out.println("Объем равен " + volume);
        //получить объем второй коробки
        volume = mybox2.vol1();
        System.out.println("Объем равен " + volume);
    }
}
