import java.util.Arrays;

import static java.lang.Character.getName;

public class Main {

    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {


        employee[0] = new Employee("Иванов Сергей Александрович", 75000, 1);
        employee[1] = new Employee("Сергеев Александр Иванович", 82000, 2);
        employee[2] = new Employee("Александров Иван Сергеевич", 78000, 3);
        employee[3] = new Employee("Петров Владимир Алексеевич", 85000, 4);
        employee[4] = new Employee("Владимиров Алексей Петрович", 88000, 5);
        employee[5] = new Employee("Алексеев Петр Владимирович", 77000, 1);
        employee[6] = new Employee("Сидорв Максим Андреевич", 84000, 2);
        employee[7] = new Employee("Максимов Андрей Сидорович", 80000, 3);
        employee[8] = new Employee("Андреев Сидор Максимович", 87000, 4);
        employee[9] = new Employee("Баридзе Вахтанг Магомедович", 85000, 5);

        System.out.println("Список сотрудников:");
        System.out.println(printEmployees());

        System.out.println();

        System.out.println("Сумма затрат на ЗП:");
        System.out.println(totalSalary());

        System.out.println();

        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(minSalary());

        System.out.println();

        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(maxSalary());

        System.out.println();

        System.out.println("Средняя зарплата:");
        System.out.println(middleSalary());

        System.out.println();

        System.out.println("ФИО сотрудников:");
        System.out.println(listOfName());
    }

    //Метод для вывода данных всех сотрудников в консоль
    public static String printEmployees() {
        return Arrays.toString(employee);
    }

    //Метод для рассчета суммы зарплаты за месяц
    public static double totalSalary() {
        double sum = 0;
        for (Employee value : employee) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    //Метод для определения сотрудника с минимальной зарплатой
    public static String minSalary() {
        double min = Double.MAX_VALUE;
        String employeeName = null;
        for (Employee value : employee) {
            if (value.getSalary() < min) {
                min = value.getSalary();
                employeeName = value.getName();
            }
        }
        return employeeName + ", зарплата - " + min;
    }

    //Метод для определения сотрудника с максимальной зарплатой
    public static String maxSalary() {
        double max = 0;
        String employeeName = null;
        for (Employee value : employee) {
            if (value.getSalary() > max) {
                max = value.getSalary();
                employeeName = value.getName();
            }
        }
        return employeeName + ", зарплата - " + max;
    }

    //Метод для определения среденей зарплаты
    public static String middleSalary() {
        double middle = totalSalary() / employee.length;
        return "Средняя зарплата составляет " + middle;
    }

    //Метод для выведения в консоль ФИО всех сотрудников
    public static String listOfName() {
        String[] employeeName = new String[10];
        for (int i = 0; i < employee.length; i++) {
            employeeName[i] = employee[i].getName();
        }
        return Arrays.toString(employeeName);
    }
}


