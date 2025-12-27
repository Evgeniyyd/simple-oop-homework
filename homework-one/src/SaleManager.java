public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;


    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void display() {
        System.out.println(this.toString());

    }

    public double calculateSalary() {
        double baseSalary = getBaseSalary();
        double sales = getBaseSalary();
        double bonus = getBonus();

        if (baseSalary < 0 || sales < 0 || bonus < 0) {
            System.out.println("Ошибка!");
        }

        return baseSalary + (bonus % sales);
    }

    @Override
    public String toString() {
        return "SaleManager" + "\n" +
                "totalSales= " + totalSales +
                ", bonus= " + bonus;
    }
}
