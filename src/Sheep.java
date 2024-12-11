public class Sheep extends Animal {
    private String woolColor;

    public Sheep(String name, boolean hungry, double weight, int age, String birthday, String woolColor) {
        super("Sheep", name, hungry, weight, age, birthday);
        this.woolColor = woolColor;
    }

    public Sheep() {
        this.species = "Sheep";
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    public void makeNoise() {
        System.out.println("bahhahaha");
    }

}
