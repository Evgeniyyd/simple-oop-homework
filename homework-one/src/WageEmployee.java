public class WageEmployee extends Employee {
    double hours;
    double wage;

    public static void display() {

    }
   public double calculateSalary(){
        return baseSalary + (hours * wage);
    }
}
