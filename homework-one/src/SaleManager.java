public class SaleManager extends Employee{
    double totalSales;
    double bonus;

    public static void display(){

    }
    public double calculateSalary(){

        return (baseSalary + bonus) % totalSales;
    }
}
