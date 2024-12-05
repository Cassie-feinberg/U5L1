public class Sheep extends Animal {
    private String woolColor;

    public Sheep(String name, boolean hungry, double weight, int age, String birthday, String woolColor) {
        this.species = "Sheep";
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
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
