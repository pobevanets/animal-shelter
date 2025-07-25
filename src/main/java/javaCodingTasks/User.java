package javaCodingTasks;

public class User {
    private String name;
    private int age;

    // constructor, getters, setters
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{name=" + name + ", age=" + age + "}";
    }
}
