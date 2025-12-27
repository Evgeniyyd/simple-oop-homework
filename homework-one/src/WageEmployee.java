public class WageEmployee extends Employee {
    private double hours;
    private double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public void display() {
        System.out.println(this.toString());

    }

    public double calculateSalary() {
        double salary = getBaseSalary();
        if (salary < 0){
          throw  new IllegalArgumentException("Ошибка");
        }
        return salary + (hours * wage);
    }

    @Override
    public String toString() {
        return "WageEmployee" + "\n" +
                "hours= " + hours +
                ", wage= " + wage;
    }
}
