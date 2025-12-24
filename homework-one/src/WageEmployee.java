public class WageEmployee extends Employee {
    double hours;
    double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public  void display() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
   public double calculateSalary(){
        return baseSalary + (hours * wage);
    }
}
