package animalshelter;

import java.util.*;

public class AnimalShelter {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kuzia", 15);
        Cat cat2 = new Cat("Masha", 13);
        Cat cat3 = new Cat("Lisa", 8);
        Dog dog1 = new Dog("Dick", 6);
        Dog dog2 = new Dog("Totoshka", 13);
        Cat cat4 = new Cat("Masha", 13);

        List<Animal> animalList = List.of(cat1, cat2, cat3, dog1, dog2, cat4);

        Map<String, List<Animal>> animalsMap = new HashMap<>();

        for (Animal animal : animalList) {
            String type = animal.getClass().getSimpleName(); // "Cat" or "Dog"

            // Ensure a list exists for this type
            animalsMap.putIfAbsent(type, new ArrayList<>());

            // Add the animal to the correct list
            animalsMap.get(type).add(animal);
        }

        // Print the result
        for (Map.Entry<String, List<Animal>> entry : animalsMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Animal animal : entry.getValue()) {
                System.out.println("  " + animal);
            }
        }
    }
}