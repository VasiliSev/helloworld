import java.util.Objects;

public class Employee {


    //ФИО сотрудника
    private final String fullName;

    //зарплата сотрудника
    private double salary;

    //номер отдела
    private int department;

    //счетчик
    public int id = 0;
    static int counter = 0;
    public static void counter() {
        counter++;
    }

    public Employee(String fullName, double salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        counter();
        id = id + counter;
    }

    public String getName() {
        return this.fullName;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department);
    }

    public String toString() {
        return id + " ФИО: " + this.fullName + " Зарплата: " + this.salary + " Отдел: " + this.department;
    }

}



