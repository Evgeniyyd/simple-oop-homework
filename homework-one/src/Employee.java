public class Employee extends Person {
    private String company;
    private String position;
    private double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Employee" +" "+
                "company= " + company  +
                ", position= " + position  +
                ", baseSalary= " + baseSalary;
    }
}
