import java.util.LinkedList;

public class Zoo {

    public static void main(String[] args) {
        Animal.addAnimal(new Dog("fluffy", true, 25.4, 2, "10/12", true));
        Animal.addAnimal(new Sheep("wooly", false, 78.9, 4, "7/5", "white"));
        Animal.addAnimal(new Animal());
        Animal.addAnimal(new Animal("wolf", "wolfy", true, 150.1, 7, "the dawn of time"));
        System.out.println(Animal.getAnimals());
        System.out.println("You have " + Animal.getAnimalCount() + " animals");
        Employee.addEmployee(new Employee("bobby", 32, true, true, 7));
        Employee.addEmployee(new Employee("mia", 19, false, false, 1));
        Employee maya = new Employee();
        maya.setName("maya");
        maya.setAge(21);
        maya.setManager();
        Employee.addEmployee(maya);
        System.out.println(Employee.getEmployees());
        System.out.println("You have " + Employee.getEmployeeCount() + " employees");
    }
}