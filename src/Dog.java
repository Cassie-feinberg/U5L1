public class Dog extends Animal{
    private boolean spots;

    public Dog(String name, boolean hungry, double weight, int age, String birthday, boolean spots) {
        super("Dog", name, hungry, weight, age, birthday);
        this.spots = spots;
    }

    public boolean hasSpots() {
        return spots;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    public void makeNoise() {
        System.out.println("woof");
    }
}
