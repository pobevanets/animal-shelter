package animalshelter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kuzia", 15);
        Cat cat2 = new Cat("Masha", 13);
        Cat cat3 = new Cat("Lisa", 8);
        Dog dog1 = new Dog("Dick", 6);
        Dog dog2 = new Dog("Totoshka", 13);
        Cat cat4 = new Cat("Masha", 13);

        //#1 Working with array
        Animal[] animals = new Animal[]{cat1, cat2, cat3, dog1, dog2, cat4};
        for (Animal animal:animals) {
            processAnimal(animal, cat2);
        }

        //#2 Working with list
        List<Animal> animalList = List.of(cat1, cat2, cat3, dog1, dog2, cat4);
        for (Animal animal:animalList) {
            processAnimal(animal, cat2);
        }
    }

    private static void processAnimal(Animal animal, Animal reference) {
        System.out.println(animal + " says " + animal.speak());

        if (animal instanceof Dog dog) {
            dog.fetch();
            dog.fetch("bone");
        }

        if (animal.equals(reference)) {
            System.out.println(animal + " is EQUAL to " + reference);
        } else {
            System.out.println(animal + " is NOT equal to " + reference);
        }
    }
}