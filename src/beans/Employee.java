package beans;

import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private String department;
    private String gender;
    private List<Employee> employeeList;

    public Employee(String name, Integer age, String department, String gender) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.gender = gender;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
