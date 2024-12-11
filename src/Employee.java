import java.util.LinkedList;

public class Employee {

    private String name;
    private int age;
    private boolean fullTime;
    private boolean manager;
    private int yearsWorked;
    private static int employeeCount;
    private static LinkedList<Employee> employees = new LinkedList<Employee>();


    public Employee(String name, int age, boolean fullTime, boolean manager, int yearsWorked){
        this.name = name;
        this.age = age;
        this.fullTime = fullTime;
        this.manager = manager;
        this.yearsWorked = yearsWorked;
    }

    public Employee(){
    }

    public String getName(){
        return name;
    }

    public int getage(){
        return age;
    }

    public boolean isFullTime(){
        return fullTime;
    }

    public boolean isManager(){
        return manager;
    }

    public int getYearsWorked(){
        return yearsWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public void setManager(){
        this.manager = true;
    }

    public void setFullTime(){
        this.fullTime = true;
    }

    public void fired(){
        System.out.println(name + " is fired!");
    }
    public String toString(){
        return ("Employee " + name + " is " + age + " years old and has worked at this zoo for " + yearsWorked + " years");
    }
    public static void addEmployee(Employee employee){
        employees.add(employee);
        employeeCount += 1;
    }

    public static LinkedList<Employee> getEmployees() {
        return employees;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}


