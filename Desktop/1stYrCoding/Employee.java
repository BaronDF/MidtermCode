public class Employee{
    private String name;
    private int age;
    private String designation;
    private int salary;

    public Employee (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public void printEmployee () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main (String[]args){
    Employee empOne = new Employee("James Smith");
    Employee empTwo = new Employee ("Mary Anne");

    empOne.setAge (26);
    empOne.setDesignation ("Senior Software Developer");
    empOne.setSalary (1000);
    empOne.printEmployee();

    empTwo.setAge (21);
    empTwo.setDesignation ("Software Developer");
    empTwo.setSalary (500);
    empTwo.printEmployee();
    }
}
