package Bai8;

public class Employee {
    String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void manage(){
        System.out.println("Employee " + name + " has been managed");
    }
    public void working(){
        System.out.println("Employee " + name + " has been working");
    }
    public void sell(){
        System.out.println("Employee " + name + " has been selling stuff");
    }
}
class Manager extends Employee{
    public Manager(String name, double salary, String department){
        super(name, salary, department);
    }
    @Override
    public void manage() {
        System.out.println("Manager " + name + " managing employees");
    }
}
class Developer extends Employee{
    public Developer(String name, double salary, String department){
        super(name, salary, department);
    }

    @Override
    public void working() {
        System.out.println("Development staff " + name  + " has been programming");
    }
}
class Saleperson extends Employee{
    public Saleperson(String name, double salary, String department){
        super(name, salary, department);
    }
    @Override
    public void sell() {
        System.out.println("Sale person " + name + " do selling stuff");
    }
}
class Main2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Goku", 5000000, "Manager");
        Developer developer = new Developer("Kiana", 5000000, "Development");
        Saleperson saleperson = new Saleperson("Fuhua", 1900000, "Saleperson");

        manager.manage();
        developer.working();
        saleperson.sell();
    }
}


