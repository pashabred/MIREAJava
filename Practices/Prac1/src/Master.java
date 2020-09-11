public class Master {
    public static void main(String[] args) {

        Dog dog = new Dog("Puppy", "dachshund");
        dog.bark();
        System.out.println(dog.name);
        dog.passYear();
        dog.setName("Doggy");
        dog.walk();
        System.out.println(dog);
    }
}
