package lesson8.javaBookExamples;

import lesson8.javaBookExamples.Box1;

public class DemoBox4 {
    public static void main(String[] args){
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        //double volume;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        //volume = mybox1.vol1();
        //System.out.println("Объем равен " + volume);

        //volume = mybox2.vol1();
        //System.out.println("Объем равен " + volume);

        System.out.println("Объем равен " + mybox1.vol1());

        System.out.println("Объем равен " + mybox2.vol1());

    }
}
