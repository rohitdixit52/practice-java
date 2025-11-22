
class EmployeeBase{
    String name;
    double baseSalary;

    EmployeeBase(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;

    }

    double calculateSalary(){
        return baseSalary;
    }
}

   class FullTimeEmployee extends EmployeeBase{
    FullTimeEmployee(String name, double baseSalary){
        super(name, baseSalary);
    }
     double calculateSalary(){
        return  baseSalary + 5000;
     }
}

   class PartTimeEmployees extends EmployeeBase{
    int hoursWoked;
    PartTimeEmployees(String name, double baseSalary, int hoursWoked){
        super(name, baseSalary);
        this.hoursWoked = hoursWoked;
    }
         double calculateSalary(){
            return baseSalary + (hoursWoked * 200);
         }

   }
public class SalaryDemo {
    public static void main(String[] args) {
        EmployeeBase e1 = new FullTimeEmployee("Rohit", 30000);
        EmployeeBase e2 = new PartTimeEmployees("Aman", 10000, 20);

        System.out.println(e1.name + " salary: " + e1.calculateSalary());
        System.out.println(e2.name + " salary: " + e2.calculateSalary());
    }
}
