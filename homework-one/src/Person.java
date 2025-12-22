
import java.util.List;
import java.util.Objects;

public class Person {
    String name;
    int age;
    boolean married;

    public static void display() {
    }

    public static List Allemployees(List<String> employees) {
        if (Objects.isNull(employees)) {
            return employees;
        }
        return null;
    }

    public static double expensesCompany(double expenses) {
        return 0.0;
    }
}


//создать
//        - Статический метод, который выведет на консоль информацию обо всех сотрудниках из массива. OK
//      - Статический метод, который вернет затраты компании(зарплата всех сотрудников). OK
//        - Статический метод, который вернет доход компании(все продажи). Это приносят только **SalesManagers**.
//        - Статический метод поиска сотрудника в массиве, метод возвращает true если сотрудник в массиве есть и false если нет.
//        - Принимает массив сотрудников и искомого сотрудника.
//В каждом методе должна быть проверка на null