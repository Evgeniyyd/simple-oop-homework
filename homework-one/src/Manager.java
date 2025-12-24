public class Manager extends Employee{
    int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public  void display(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public double calculateSalary(){
        return baseSalary * grade;
    }
}
