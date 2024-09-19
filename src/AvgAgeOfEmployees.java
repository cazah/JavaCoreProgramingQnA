import beans.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AvgAgeOfEmployees {
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

        double avg = employeeList.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
        System.out.println(avg);
        double avgMale = employeeList.stream()
                        .filter(employee -> employee.getGender().equals("M"))
                        .mapToInt(Employee :: getAge)
                        .average()
                        .orElse(0.0);
        System.out.println(avgMale);

    }
}
