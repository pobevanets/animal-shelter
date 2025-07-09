import java.util.*;
import java.util.stream.Collectors;

public class AnimalStreams {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(
                new Cat("Kuzia", 15),
                new Cat("Masha", 13),
                new Cat("Lisa", 8),
                new Dog("Dick", 6),
                new Dog("Totoshka", 13),
                new Cat("Masha", 13)
        );


        //Task 1: Count how many animals of each type
        // 1.1 Using map and loops
        Map<String, Integer> countMap = new HashMap<>();

        for (Animal animal : animalList) {
            String type = animal.getClass().getSimpleName(); // "Cat" or "Dog"
            countMap.put(type, countMap.getOrDefault(type, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 1.2 Using streams
        Map<String, Long> countMapStream = animalList.stream()
                .collect(Collectors.groupingBy(
                        animal -> animal.getClass().getSimpleName(),
                        Collectors.counting()
                ));

        countMapStream.forEach((type, count) ->
                System.out.println(type + " = " + count));


        //Task 2: Filter and print only animals older than 10
        // 2.1 Using for loop
        for (Animal animal : animalList) {
            if (animal.getAge() > 10) {
                System.out.println(animal);
            }
        }

        //2.2 Using streams
        animalList.stream()
                .filter(animal -> animal.getAge() > 10)
                .forEach(System.out::println);


        //Task 3: Create a Map<String, List<Animal>> grouped by type using Collectors.groupingBy(...)
        Map<String, List<Animal>> groupedAnimals = animalList.stream()
                .collect(Collectors.groupingBy(animal -> animal.getClass().getSimpleName()));

        groupedAnimals.forEach((type, animals) -> {
            System.out.println(type + ":");
            animals.forEach(animal -> System.out.println("  " + animal));
        });


        //Task 4: Find the oldest animal (.stream().max(...) with Comparator.comparingInt(...))
        Optional<Animal> oldest = animalList.stream()
                .max(Comparator.comparingInt(Animal::getAge));

        oldest.ifPresent(animal -> System.out.println("Oldest animal: " + animal));


        //Task 5: Print all animal names (no duplicates)
        //Use:
        //.stream().map(...) to extract names
        //.distinct() to remove duplicates
        //Collect into a List<String>

        List<String> animalNames = animalList.stream()
                .map(Animal::getName)
                .distinct()
                .toList();

        System.out.println(animalNames);


        //Task 6: Count how many animals have the same name
        Map<String, Long> nameCounts = animalList.stream()
                .collect(Collectors.groupingBy(
                        Animal::getName,
                        Collectors.counting()
                ));

        nameCounts.forEach((name, count) -> System.out.println(name + " = " + count));

    }
}
