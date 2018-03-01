package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo {

    public  static void main(String[] args){

    Box1 mybox = new Box1();//объявляем объект типа Box1
        //либо так
        //Box1 mybox; - объявляем ссылку на объект
        //mybox = new Box1(); - выделяем память для нового объекта класса Box1

    double vol;
//присваиваем значения переменным экземпляра mybox
    mybox.width = 10;
    mybox.depth = 20;
    mybox.height = 15;

    //рассчитать объем коробки
        vol = mybox.width * mybox.depth * mybox.height;
        System.out.println("Объем равен " + vol);
    }
}



