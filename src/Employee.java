public class Employee {
    //TODO: create employee class variables
    private String name;
    private int age;
    private boolean fullTime;
    private boolean manager;
    private int yearsWorked;


    //TODO: create constructors
    public Employee(String name, int age, boolean fullTime, boolean manager, int yearsWorked){
        this.name = name;
        this.age = age;
        this.fullTime = fullTime;
        this.manager = manager;
        this.yearsWorked = yearsWorked;
    }

    public Employee(){
    }


    //TODO: create getters and setters

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

    //TODO: any other methods?

    public void fired(){
        System.out.println(name + " is fired!");
    }
    public String toString(){
        return ("Employee " + name + " is " + age + " years old, and has worked at this zoo for " + yearsWorked + " years");
    }

    //TODO: create main method test
    public static void main(String[] args) {
        Employee mia = new Employee();
        mia.setAge(21);
        mia.setManager();
        System.out.println(mia.getage());
        System.out.println(mia);
    }


}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo

