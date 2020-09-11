public class Human implements Head, LegLeft, LegRight, Body, ArmLeft, ArmRight {
    String name;
    int age;
    double coordinateX;
    double energy;
    int money;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }
    public void toAge() {
        this.age++;
    }

    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void think() {
    }

    @Override
    public void stepLeft() {
        coordinateX+=0.5;
        energy-=0.2;
    }

    @Override
    public void stepRight() {
        coordinateX+=0.5;
        energy-=0.2;
    }

    @Override
    public void digest() {
        energy++;
    }

    @Override
    public void grabLeft() {
        money++;
    }

    @Override
    public void grabRight() {
        money++;
    }
}
