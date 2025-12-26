public class Manager extends Employee {
    int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public void display() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Manager:" + "\n" +
                "grade= " + grade;
    }
//        public double calculateSalary(){
//        return baseSalary * grade;
//    }
}
