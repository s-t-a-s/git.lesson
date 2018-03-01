package lesson8.javaBookExamples;

public class Box1 {

    protected double width;
    protected double height;
    protected double depth;

    //обычный конструктор класса Box1
    Box1 (){
        System.out.println("Конструирование объекта Box1");//для наглядности
        width = 10;
        height = 10;
        depth = 10;
    }


    //параметризированный конструктор класса Box1
    Box1 (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать объем коробки
    void vol() {

        System.out.println("Объем равен " + (width * depth * height));
    }
    //рассчитать и возвратить объем коробки
    double vol1() {

        return width * depth * height;
    }

    void setDimensions (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
}
}
