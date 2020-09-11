public class Dog {
    String name;
    public String breed;
    private int tiredness;
    private int age;

    Dog(String name, String breed) {
        this.name = name;
        age = 0;
        tiredness = 0;
        this.breed = breed;
    }

    void bark() {
        System.out.println("bark!");
    }
    void walk() {
        tiredness++;
    }
    void setName(String name) {
        this.name = name;
    }
    void passYear() {
        age++;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", tiredness=" + tiredness +
                ", age=" + age +
                '}';
    }
}
