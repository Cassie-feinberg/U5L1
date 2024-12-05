public class Dog extends Animal{
    private boolean spots;

    public Dog(String name, boolean hungry, double weight, int age, String birthday, boolean spots) {
        this.species = "Dog";
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
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
