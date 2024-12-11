import java.util.LinkedList;

public class Animal {

    protected String species;
    protected String name;
    protected boolean hungry;
    protected double weight;
    protected int age;
    protected String birthday;
    protected static int animalCount = 0;
    protected static LinkedList<Animal> animals = new LinkedList<Animal>();


    //question: do you need to fill in all instance variables for a class to work? can you only fill one?

    public Animal(String species, String name, boolean hungry, double weight, int age, String birthday){
        this.species = species;
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
    }

    public Animal(){ //class question: how can I be as lazy as possible right now
        this.species = "giraffe";
        this.name = "giraffy";
        this.hungry = true; //maybe this leads to future gameification?
        this.weight = 360.77;
        this.age = 12;
        this.birthday = "11/11/11"; //because it is a string, can be formatted in any way
    }

    //if you wanted to research an animal, what would you want to be able to look up?

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }

    //added after the fact - why isHungry instead of getHungry? (quick note about naming conventions)
    public boolean isHungry() {
        return hungry;
    }

    public String toString(){
        return ("This is a " + species + " named " + name + " who is "+ age + " years old");
    }

    //what are aspects of this animal that should/could be changeable?
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void makeNoise(){
        if (hungry){
            System.out.println("*stomach growls*");
        } else {
            System.out.println("*snores*");
        }
    }
    public static void addAnimal(Animal animal){
        animals.add(animal);
        animalCount += 1;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static LinkedList<Animal> getAnimals() {
        return animals;
    }
}

