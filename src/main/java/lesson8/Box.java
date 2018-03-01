package lesson8;

public class Box {

    double width;
    double height;
    double depth;


    //конструктор по умолчанию класса Box
    public Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    //параметризированный конструктор класса Box
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    //создание объектов класса Box
    Box box = new Box(10, 20, 30);
    Box box2 = new Box(10, 10, 10);
    Box box3 = new Box(17, 15, 4);
}


/**public double depth; // глубина
   public Box(double depth){
       this.depth = depth;
   }

   public Box(double width, double height, double depth, String name){
       this(width, height, depth);
       // Вызов конструктора для заполнения полей
       //       this.name = name;
   }*//*




 */
/*
   public double width;
   public double height;
   public double depth;*//*


   //это новый МЕТОД!!!!


*/
/* public  void volume(){
       System.out.println("Объем равен");
       System.out.println(width*height*depth);
   }*//*
 */
/*


   public String getVolume(){

       return "Объем равен" + (width*height*depth);
   }
   public void printInfo(){
       System.out.println(getVolume());
   }

}**/
