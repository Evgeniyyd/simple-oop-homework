public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;


    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public void display() {
        System.out.println(this.toString());

    }

    public double calculateSalary() {

        return 0;
    }

    @Override
    public String toString() {
        return "SaleManager" + "\n" +
                "totalSales= " + totalSales +
                ", bonus= " + bonus + super.toString();
    }
}
