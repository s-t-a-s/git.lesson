package lesson8;

public class BoxClass {

    public double width;
    public double height;
    public double depth;
    public String name;


    //конструктор по умолчанию класса BoxClass
    BoxClass() {
        width = 10;
        height = 10;
        depth = 10;
    }

    //параметризированный конструктор класса Box
    BoxClass(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //создание объектов класса BoxClass путем вызова параметризированного конструктора
    BoxClass box = new BoxClass(10, 20, 30);
    BoxClass box2 = new BoxClass(10, 10, 10);
    BoxClass box3 = new BoxClass(17, 15, 4);

    /**
     * public double depth; // глубина
     * public BoxClass(double depth){
     * this.depth = depth;
     * }
     **/


    public BoxClass(double width, double height, double depth, String name) {
        this(width, height, depth); // Вызов конструктора для заполнения полей
        this.name = name;
    }


    //метод для вывода объема коробки - ничего не возвращает
    public void volume() {
        System.out.println("Объем равен");
        System.out.println(width * height * depth);
    }

    //разбиваем метод выше на два отдельных метода

    //метод возвращает строку
    public String getVolume(){
        return "Объем равен" + (width*height*depth);
   }

    //метод выводит строку в консоль
    public void printInfo(){
       System.out.println(getVolume());
   }
}
