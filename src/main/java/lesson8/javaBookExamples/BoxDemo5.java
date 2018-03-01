package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo5 {
    public static void main(String[] args){
        //объявляем объекты
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        //инициализируем переменные новых объектов
        mybox1.setDimensions(10, 20, 15);
        mybox2.setDimensions(3, 6, 9);

        System.out.println("Объем равен " + mybox1.vol1());
        System.out.println("Объем равен " + mybox2.vol1());
    }
}
