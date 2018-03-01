package lesson8;
import javax.swing.*;

public class ColorBox extends BoxClass {
    int color; // цвет коробки
    //переопределяем метод printInfo() из родительского класса BoxClass
    @Override
    public void printInfo(){
        System.out.println("Объем коробки: "+getVolume());
        System.out.println("Цвет коробки: "+color);
    }

}