import java.sql.SQLOutput;
import java.util.Arrays;

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

        System.out.println();
        System.out.println("Повышенная сложность");

        System.out.println();
        System.out.println("Запрлата после индексации");
        System.out.println(getIndex(10));

        System.out.println();
        System.out.println("Список сотрудников отдела");
        System.out.println(Arrays.toString(getDepartmentForNumber(3)));

        System.out.println();
        System.out.println("Минимальная зарплата в отделе ");
        System.out.println(minSalaryInDepartment(3));

        System.out.println();
        System.out.println("Максимальная зарплата в отделе ");
        System.out.println(maxSalaryInDepartment(3));

        System.out.println();
        System.out.println("Сумма затрат на ЗП по отделу 3 " + totalSalaryInDepartment(3));

        System.out.println();
        System.out.println(middleSalaryInDepartment(3));

        System.out.println();
        System.out.println("Запрлата в отделе после индексации");
        System.out.println(getIndexInDept(10, 3));

        System.out.println();
        System.out.println("Список сотрудников отдела 3");
        System.out.println(listOfDep(3));

        System.out.println();
        System.out.println("Спиок сотрудников с зарплатой ниже 80000");
        System.out.println(listUnderNumber(80000));

        System.out.println();
        System.out.println("Списко сотрудников с зарплатой больше или равной 80000");
        System.out.println(listOverNumber(80000));

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

    // повышенная сложность
    // метод для инексации заработной платы
    public static String getIndex(double index) {
        String[] indexedSalary = new String[10];
        for (int i = 0; i < employee.length; i++) {
            indexedSalary[i] = employee[i].getName() + ' ' + employee[i].getSalary() * (1 + index / 100);
        }
        return Arrays.toString(indexedSalary);
    }

    //Получаем список отдела по номеру отдела
    public static Employee[] getDepartmentForNumber(int numOfDepartment) {

        //счетчик ненулевых элементов
        int n = 0;

        Employee[] departmentStart = new Employee[10];
        Employee[] departmentMiddle = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == numOfDepartment) {
                departmentStart[i] = employee[i];
                departmentMiddle[n] = departmentStart[i];
                n++;
            }
        }
        Employee[] department = new Employee[n];
        System.arraycopy(departmentMiddle, 0, department, 0, department.length);
        return department;
    }

    //Метод для определения сотрудника с минимальной зарплатой в отделе
    public static String minSalaryInDepartment(int numOfDepartment) {
        Employee[] department = getDepartmentForNumber(numOfDepartment);
        double minInDepartment = Double.MAX_VALUE;
        String employeeInDepartmentName = null;
        for (Employee value : department) {
            if (value.getSalary() < minInDepartment) {
                minInDepartment = value.getSalary();
                employeeInDepartmentName = value.getName();
            }
        }
        return " Отдел " + numOfDepartment + " сотрудник " + employeeInDepartmentName + ", зарплата - " + minInDepartment;
    }

    public static String maxSalaryInDepartment(int numOfDepartment) {
        Employee[] department = getDepartmentForNumber(numOfDepartment);
        double maxInDepartment = 0;
        String employeeInDepartmentName = null;
        for (Employee value : department) {
            if (value.getSalary() > maxInDepartment) {
                maxInDepartment = value.getSalary();
                employeeInDepartmentName = value.getName();
            }
        }
        return " Отдел " + numOfDepartment + " сотрудник " + employeeInDepartmentName + ", зарплата - " + maxInDepartment;
    }

    //Сумма затрат за ЗП по отделу
    public static double totalSalaryInDepartment(int numOfDepartment) {
        Employee[] department = getDepartmentForNumber(numOfDepartment);
        double sumInDepartment = 0;
        for (Employee value : department) {
            sumInDepartment = sumInDepartment + value.getSalary();
        }
        return sumInDepartment;
    }

    //Средняя зарплата в отделе
    public static String middleSalaryInDepartment(int numOfDepartment) {
        Employee[] department = getDepartmentForNumber(numOfDepartment);
        double middleInDpt = totalSalaryInDepartment(numOfDepartment) / department.length;
        return "Средняя зарплата в отделе " + numOfDepartment + " составляет " + middleInDpt;
    }

    //Индексация зарплаты сотрудников отдела
    public static String getIndexInDept(double index, int numOfDpt) {
        Employee[] department = getDepartmentForNumber(numOfDpt);
        String[] indexedSalaryInDpt = new String[department.length];
        for (int i = 0; i < department.length; i++) {
            indexedSalaryInDpt[i] = department[i].getName() + ' ' + department[i].getSalary() * (1 + index / 100);
        }
        return Arrays.toString(indexedSalaryInDpt);
    }

    //Получение списка сотрудников отдела
    public static String listOfDep(int numOfDpt) {
        Employee[] department = getDepartmentForNumber(numOfDpt);
        String[] employeeOfDepartment = new String[department.length];
        for (int i = 0; i < department.length; i++) {
            employeeOfDepartment[i] = department[i].id + " " + department[i].getName() + " " + department[i].getSalary();
        }
        return Arrays.toString(employeeOfDepartment);
    }

    //Получение списка сотрудников с зарплатой меньше числа
    public static String listUnderNumber(double compareNumber) {
        int n = 0;
        Employee[] listStart = new Employee[10];
        Employee[] listMiddle = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < compareNumber) {
                listStart[i] = employee[i];
                listMiddle[n] = listStart[i];
                n++;
            }
        }
        Employee[] list = new Employee[n];
        System.arraycopy(listMiddle, 0, list, 0, list.length);
        String[] listUnderNumber = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            listUnderNumber[i] = list[i].id + " " + list[i].getName() + " " + list[i].getSalary();
        }
        return Arrays.toString(listUnderNumber);
    }

    //Список сотрудников с зарплатой больше или равно числу
    public static String listOverNumber(double compareNumber) {
        int n = 0;
        Employee[] listStart = new Employee[10];
        Employee[] listMiddle = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= compareNumber) {
                listStart[i] = employee[i];
                listMiddle[n] = listStart[i];
                n++;
            }
        }
        Employee[] list = new Employee[n];
        System.arraycopy(listMiddle, 0, list, 0, list.length);
        String[] listOverNumber = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            listOverNumber[i] = list[i].id + " " + list[i].getName() + " " + list[i].getSalary();
        }
        return Arrays.toString(listOverNumber);
    }
}



