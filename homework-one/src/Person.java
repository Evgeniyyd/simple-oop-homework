
import java.util.List;
import java.util.Objects;

public class Person {
    String name;
    int age;
    boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void display() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    //- Статический метод, который выведет на консоль информацию обо всех сотрудниках из массива.
    public static List allemployees(List<String> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }
        return null;
    }

    //      - Статический метод, который вернет затраты компании(зарплата всех сотрудников).
    public static double expensesCompany(double salary) {
        if (salary == 0) {
            System.out.println(" ");

        }
        return 0.0;
    }

    // - Статический метод, который вернет доход компании(все продажи). Это приносят только **SalesManagers**.
    public static int salesManagers(int allSales) {
        if (allSales == 0) {
            return 0;
        }
        return 0;
    }

    public static boolean employeeSearch(int[] allEmployee, int employee) {
        if (allEmployee == null || allEmployee.length == 0) {
            System.out.println(" ");
        }
        return true;
    }
}
//   - Статический метод поиска сотрудника в массиве
//   - метод возвращает true если сотрудник в массиве есть и false если нет
//   - Принимает массив сотрудников и искомого сотрудника
//   -В каждом методе должна быть проверка на null
