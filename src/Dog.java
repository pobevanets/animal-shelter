public class Dog extends Animal {

     public Dog(String name, int age) {
         super(name, age);
     }

     @Override
    public String speak() {
         return "Woof!";
     }

     public void fetch() {
         System.out.println("Dog is fetching!");
     }

     public void fetch(String item) {
         System.out.println("Dog is fetching the " + item + "!");
     }
}
