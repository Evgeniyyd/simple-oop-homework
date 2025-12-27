public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петя", 43, true);
        person.display();

        Employee employee = new Employee("Сергей", 65, true, "Адидас", "Менеджер", 76);
        employee.display();
        Manager manager = new Manager("Ваня", 43, true, "Адидас", "Продавец", 34, 3);
        manager.display();
    }
}
