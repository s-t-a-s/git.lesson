package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo6 {
    public static void main(String[] args){
        //объявляем, выделяем память и инициализируем объекты типа Box1
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();

        double volume;

        //получить объем первой коробки
        volume = mybox1.vol1();//назначаем переменной результат выполнения метода
        System.out.println("Объем равен " + volume);
        //получить объем второй коробки
        volume = mybox2.vol1();
        System.out.println("Объем равен " + volume);
    }

}
