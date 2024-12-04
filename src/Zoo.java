import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zoo {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<Animal>();
        LinkedList<Employee> employees = new LinkedList<Employee>();
        Animal fluffy = new Animal("dog", "fluffy", true, 25.4, 2, "10/12");
        animals.add(fluffy);
        Sheep wooly = new Sheep("wooly", false, 78.9, 4, "7/5", "white");
        animals.add(wooly);
        System.out.println(animals);
        Employee martha = new Employee("martha", 32, true, true, 7);
        Employee mia = new Employee("mia", 19, false, false, 1);
        employees.add(martha);
        employees.add(mia);
        System.out.println(employees);
        wooly.makeNoise();
        fluffy.makeNoise();
    }
}