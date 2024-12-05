import java.util.LinkedList;

public class Zoo {
    static int employeeCount;
    static int animalCount;
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        LinkedList<Employee> employees = new LinkedList<Employee>();
        Dog fluffy = new Dog("fluffy", true, 25.4, 2, "10/12", true);
        animals.add(fluffy); animalCount += 1;
        Sheep wooly = new Sheep("wooly", false, 78.9, 4, "7/5", "white");
        animals.add(wooly); animalCount += 1;
        Animal giraffy = new Animal();
        animals.add(giraffy); animalCount += 1;
        Animal wolfy = new Animal("wolf", "wolfy", true, 150.1, 7, "the dawn of time");
        animals.add(wolfy); animalCount += 1;
        System.out.println(animals);
        Employee bobby = new Employee("bobby", 32, true, true, 7);
        Employee mia = new Employee("mia", 19, false, false, 1);
        Employee maya = new Employee();
        maya.setName("maya");
        maya.setAge(21);
        maya.setManager();
        employees.add(bobby); employeeCount += 1;
        employees.add(mia); employeeCount += 1;
        employees.add(maya); employeeCount += 1;
        System.out.println(employees);
        wooly.makeNoise();
        fluffy.makeNoise();
        giraffy.makeNoise();
        wolfy.makeNoise();
        System.out.println(wooly.getName() + " has " + wooly.getWoolColor() + " colored wool");
        System.out.println(fluffy.getName() + " has spots? " + fluffy.hasSpots());
    }
}