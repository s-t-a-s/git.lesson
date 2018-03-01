package lesson8;

public class HeavyBox extends BoxClass {

    int weight; // вес коробки

//переопределяем метод printInfo() из родительского класса BoxClass
@Override
public void printInfo() {
        System.out.println(getVolume());
        System.out.println("Вес коробки: " + weight);
    }

//переопределяем конструктор класса HeavyBox путем вызова конструктора из суперкласса и добавления новой переменной из текущего конструктора
    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

}
