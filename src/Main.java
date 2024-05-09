public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total < 2459000) {
            total = total + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + "рублей");
            month++;
        }
        //пустая строка для разделения выводимых данных
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        //Разделение вывода результатов задачи 2 и пустая строрка
        System.out.println();
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        //начальная численность населения
        int population = 12_000_000;

        //индекс рождаемости
        int bornIndex = 17;

        //индекс смертности
        int mortIndex = 8;

        //пустая строка
        System.out.println();
        System.out.println("Вариант решения с циклом for");
        for (int year = 1; year <= 10; year++) {
            population += population * bornIndex / 1000 - population * mortIndex / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //пустая строка
        System.out.println();
        System.out.println("Вариант решения с циклом while");
        int year = 1;
        population = 12_000_000;
        while (year <= 10) {
            population += population * bornIndex / 1000 - population * mortIndex / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
        //пустая строка
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        double deposite = 15000;
        double perCentFactor = 7;
        int monthNum = 1;
        while (deposite <= 12_000_000) {
            deposite = deposite * (1 + perCentFactor / 100);
            String sumDeposit = String.format("%.2f", deposite);
            System.out.println("Месяц " + monthNum + " сумма накоплений " + sumDeposit);
            monthNum++;
        }

        //пустая строка
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        deposite = 15000;
        monthNum = 1;
        while (deposite <= 12_000_000) {
            deposite = deposite * (1 + perCentFactor / 100);
            if (monthNum % 6 == 0) {
                String sumDeposit = String.format("%.2f", deposite);
                System.out.println("Месяц " + monthNum + " сумма накоплений " + sumDeposit);
            }
            monthNum++;
        }

        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        deposite = 15000;
        monthNum = 1;

        //количество лет накопления
        int years = 9;
        while (monthNum <= years * 12) {
            deposite += deposite * perCentFactor / 100;
            if (monthNum % 6 == 0) {
                String sumDeposit = String.format("%.2f", deposite);
                System.out.println("Месяц " + monthNum + " сумма накоплений " + sumDeposit);
            }
            monthNum++;
        }

        System.out.println();

        //Задача 7
        System.out.println("Задача 7");

        //номер первой пятницы месяца
        int friday = 2;

        System.out.println();

        //вариант решения 1 - зная дату первой пятницы, вычисляем остальные
        System.out.println("Вариант решения 1");
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " число, нужно подготовить отчет");
            friday += 7;
        }

        System.out.println();

        //Вариант решения 2 - перебираем все дни месяца и сравниваем их с датой первой пятницы
        System.out.println("Вариант решения 2");
        //день месяца
        int day = 1;
        while (day <= 31) {
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + " число, нужно подготовить отчет");
            }
            day++;
        }
        System.out.println();
        //Задача 8. Опытным путем установлено, что результат задачи совпадает с контрольным, указанным в задании, в интервале от 2018 до 2032 годов
        System.out.println("Задача 8");
        int currentYear = 2024;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        while (pastYear < futureYear) {
            if (pastYear %79 == 0) {
                System.out.println(pastYear);
            }
            pastYear++;
        }

    }
}

