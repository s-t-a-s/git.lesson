package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //вызываем метод vol для обоих экземпляров класса Box1
        mybox1.vol();
        mybox2.vol();
    }
}
