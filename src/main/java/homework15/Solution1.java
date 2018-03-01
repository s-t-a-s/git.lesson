/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

package homework15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Solution1 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        result.add(new Cat("Murzik"));
        result.add(new Cat("Tihon"));
        result.add(new Cat("Pozya"));
        result.add(new Cat("Melisa"));
        return result;
//        HashSet<Cat> result = new HashSet<Cat>();
//        for (int i = 0; i < 4; i++){
//            Cat cat = new Cat();
//            result.add(cat);
//        }
//        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();
        result.add(new Dog("Sharik"));
        result.add(new Dog("Bobik"));
        result.add(new Dog("Tuzik"));
        return  result;
//        HashSet<Dog> result = new HashSet<Dog>();
//        for (int i = 0; i < 3; i++){
//            Dog dog = new Dog();
//            result.add(dog);
//        }
//        return result;

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //Печатется группа животных с помощью  итератора
        for (Iterator iterator = pets.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static class Cat {
        String name;
        public Cat (String name){
           this.name =name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Dog {
        String name;
        public Dog (String name){
            this.name =name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}