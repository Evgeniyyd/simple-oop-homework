public  class SaleManager extends Employee{
    double totalSales =97.9;
    double bonus =10.0;


    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public  void display(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public double calculateSalary(){
        return (baseSalary + bonus) % totalSales;
    }
}
