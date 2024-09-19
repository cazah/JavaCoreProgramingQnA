import beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class SortEmployeeByField {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Arun",29,"Ford","M"));
        employeeList.add(new Employee("Anto",35,"Paypal","M"));
        employeeList.add(new Employee("Raji",30,"Ford","F"));
        employeeList.add(new Employee("Rama",29,"Ford","M"));
        employeeList.add(new Employee("Aji",25,"Jumla","F"));
        employeeList.add(new Employee("Inno",23,"Ford","F"));
        employeeList.add(new Employee("Norah",1,"Kappa","F"));
        employeeList.add(new Employee("Yamuna",23,"Ford","F"));

        employeeList.stream()
                .sorted((e1,e2) -> e2.getAge().compareTo(e1.getAge()))
                .toList()
                .forEach(item -> System.out.println(item.getName()));
    }
}
