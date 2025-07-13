package javaCodingTasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCodingTasksWithStreams {
    public static void main(String[] args) {

        //1. Count word frequencies from a List<String>
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> result = countWordFrequencies(words);
        System.out.println(result); // {orange=1, banana=2, apple=3}

        //2. Filter a list of User objects by age > 18
        List<User> users = List.of(
                new User("Alice", 20),
                new User("Bob", 17),
                new User("Charlie", 25)
        );
        List<User> adults = filterAdults(users);
        System.out.println(adults.toString()); // Output: Alice and Charlie

        //3. Sort a list of Product objects by price
        List<Product> products = List.of(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Tablet", 500)
        );
        List<Product> sorted = sortByPrice(products);
        System.out.println(sorted.toString()); // Output: Tablet, Phone, Laptop

    }

    //1. Count word frequencies from a List<String>
    public static Map<String, Long> countWordFrequencies(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }

    //2. Filter a list of User objects by age > 18
    public static List<User> filterAdults(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
    }

    //3. Sort a list of Product objects by price
    public static List<Product> sortByPrice(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

}
