public class Main {
    public static void main(String[] args) {
        Person person = new Person("fdkh", 43, true);
        person.display();
        Employee employee = new Employee("hjgfh", 65, true, "fdfg", "tyghgj", 76);
        employee.display();
        Manager manager = new Manager("dsf",43, true,"dsdf","sddf",34,3);
        manager.display();
    }
}
