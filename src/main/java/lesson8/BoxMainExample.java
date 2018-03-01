package lesson8;

import javax.swing.*;

public class BoxMainExample {
    public static void main(String[] args) {

        //ссоздаем новые объекты mybox, cube and parallelepiped!!!!
        BoxClass mybox = new BoxClass();
        BoxClass cube = new BoxClass();
        BoxClass parallelepiped = new BoxClass();


        //присвоили значения переменных объекта cube (width, depth, height)!!!
        cube.width = 10;
        cube.depth = 10;
        cube.height = 10;

        //присвоили значения переменных объекта parallelepiped (width, depth, height)!!!
        parallelepiped.width = 10;
        parallelepiped.depth = 30;
        parallelepiped.height = 15;

        //вывел все в формулу volume
        cube.volume(); //вызов метода volume для объекта cube
        parallelepiped.volume(); //вызов метода volume для объекта parallelepiped
    }
}
