import java.util.LinkedList;

public class Zoo {
    static int employeeCount;
    static int animalCount;
    static LinkedList<Animal> animals = new LinkedList<Animal>();
    static LinkedList<Employee> employees = new LinkedList<Employee>();

    public static void addAnimal(Animal animal){
        animals.add(animal);
        animalCount += 1;
    }
    public static void addEmployee(Employee employee){
        employees.add(employee);
        employeeCount += 1;
    }
    public static void main(String[] args) {
        addAnimal(new Dog("fluffy", true, 25.4, 2, "10/12", true));
        addAnimal(new Sheep("wooly", false, 78.9, 4, "7/5", "white"));
        addAnimal(new Animal());
        addAnimal(new Animal("wolf", "wolfy", true, 150.1, 7, "the dawn of time"));
        System.out.println(animals);
        addEmployee(new Employee("bobby", 32, true, true, 7));
        addEmployee(new Employee("mia", 19, false, false, 1));
        Employee maya = new Employee();
        maya.setName("maya");
        maya.setAge(21);
        maya.setManager();
        addEmployee(maya);
        System.out.println(employees);
    }
}