package lesson12;

public class PetRunner {

    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.voice();
        pet.move();

        Pet pet1 = new Cat();
        pet1.voice();
        pet1.move();

        ((Dog)pet).move1();
    }
}
