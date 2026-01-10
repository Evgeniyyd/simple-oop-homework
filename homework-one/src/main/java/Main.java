import com.company.app.PersonApp;
import com.company.pojo.SaleManager;
import com.company.pojo.Manager;
import com.company.pojo.Employee;
import com.company.pojo.WageEmployee;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Петя", 43, true, "Адидас", "продавец", 34.0, 3);
        Manager manager2 = new Manager("Сергей", 41, false, "Адидас", "продавец", 54.0, 2);
        Manager manager3 = new Manager("Ваня", 32, true, "Адидас", "продавец", 34.5, 3);

        SaleManager saleManager1 = new SaleManager("Петя", 24, true, "Адидас", "Менеджер по продажам", 45.4, 434.4, 10);
        SaleManager saleManager2 = new SaleManager("Ваня", 26, false, "Адидас", "Менеджер по продажам", 65.5, 43.3, 10);
        SaleManager saleManager3 = new SaleManager("Сергей", 34, true, "Адидас", "Менеджер по продажам", 34.5, 54.5, 10);

        WageEmployee wageEmployee1 = new WageEmployee("Джон", 34, true, "Адидас", "Наемный работник", 65.6, 34.5, 76);
        WageEmployee wageEmployee2 = new WageEmployee("Маикл", 27, true, "Адидас", "Наемный работник", 56.6, 34.4, 78);
        WageEmployee wageEmployee3 = new WageEmployee("Питр", 23, false, "Адидас", "Наемный работник", 65.6, 56.5, 76);
        WageEmployee wageEmployee4 = new WageEmployee("Роберт", 22, false, "Адидас", "Наемный работник", 43.5, 45.5, 87);


        Employee[] employees = new Employee[]{manager1, manager2, manager3, saleManager1, saleManager2, saleManager3,
        wageEmployee1, wageEmployee2, wageEmployee3, wageEmployee4};
        PersonApp.getSumSalary(employees);
        PersonApp.printAllEmployee(employees);
        PersonApp.sumCompanyRevenue(employees);
        PersonApp.employeeSearch(employees, manager1);
    }
}
