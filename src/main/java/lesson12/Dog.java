package lesson12;

public class Dog extends Pet{

    @Override
    public void voice(){
            System.out.println("gaf gaf");
            isHungry = true;
        }

    @Override
    public void move() {
        if (isHungry) {
            System.out.println("пойду поем");
            return;
        }
        System.out.println("еще погуляю");
    }
    public void move1() {
        System.out.println("гулять гулять гулять");

    }
}
