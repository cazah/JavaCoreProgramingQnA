import beans.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByGender {
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

        String filterGender = "F";
        long count = employeeList.stream()
                .filter(item -> item.getGender().equals(filterGender))
                .count();
        System.out.println(count);

        Map<String,List<Employee>> listMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        listMap.forEach((key, value) -> System.out.println(key + " : " + value.size()));
    }
}
