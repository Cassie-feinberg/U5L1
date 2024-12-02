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
        this.name = "maya";
        this.age = 22;
        this.fullTime = true;
        this.manager = false;
        this.yearsWorked = 12;
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

    //TODO: create main method test



}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo

