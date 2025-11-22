     package OOPS;
     class Employee{
        String name;
        double salary;

        Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
 
        } void displayInfo(){
            System.out.println("Name : " + " " + name );
            System.out.println("Salary :" + " " + 10000);
        }
     }


     class Manager extends Employee{
        String department;

        Manager(String name, double salary, String department){
            super(name, salary);
            this.department = department;
        }

        void displayInfo(){
            super.displayInfo();
    System.out.println(" Department : " + " " +  department);
        }
     }

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager(" manish", 100000, "HR");
        m1.displayInfo();
        
    }
}
