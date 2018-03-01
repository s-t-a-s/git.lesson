package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class BoxDemo2 {

    public static void main(String [] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
        Box1 b1 = new Box1();
        Box1 b2 = b1;
        b1 = null; // b2 по-прежнему будет ссылаться на исходный обект


        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.width * mybox1.depth * mybox1.height;
        System.out.println("Объем равен " + vol);

        vol = mybox2.width * mybox2.depth * mybox2.height;
        System.out.println("Объем равен " + vol);
    }
}
