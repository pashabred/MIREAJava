public class Life {
    public static void main(String[] args) {
        double distance = 42;
        Human human = new Human("Ben", 20);
        human.stepLeft();
        human.stepLeft();
        human.toAge();
        human.changeName("Ivan");
        distance -= human.coordinateX;
    }
}
