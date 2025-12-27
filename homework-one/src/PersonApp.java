import java.util.Arrays;

public class PersonApp {

    //- Статический метод, который выведет на консоль информацию
    // обо всех сотрудниках из массива.
    public static void allemployees(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            System.out.println(" ");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            builder.append(employees[i]+"\n");
        }
        System.out.println(builder);
    }

    // - Статический метод, который вернет затраты компании(зарплата всех сотрудников).
    public static void expensesCompany(int salary) {
        if (salary == 0) return;
        System.out.println();
    }

    // - Статический метод, который вернет доход компании(все продажи).
    // Это приносят только **SalesManagers**.
    public static void salesManagers(int allSales) {
        if (allSales == 0) {
            System.out.println(allSales);
        }
    }

    public static boolean employeeSearch(String[] allEmployee, String employee) {
        if (allEmployee == null || allEmployee.length == 0) {
            return false;
        }
        return Arrays.stream(allEmployee).anyMatch(str -> str.equals(employee));
    }
}
