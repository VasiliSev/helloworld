public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задача 8
        System.out.println("Задача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 0; i <= 11; i++) {
            total = total + deposit;
            System.out.println("Месяц " + (i + 1) + " сумма накоплений равна " + total + "рублей");
        }
        //Задача 9
        System.out.println("Задача 9");
        double totalWithPercent = 0;
        for (int i = 0; i <= 11; i++) {
            totalWithPercent = totalWithPercent * 1.01;
            totalWithPercent = totalWithPercent + deposit;
            String resultSum = String.format("%.2f", totalWithPercent);//округляем до двух знаков после запятой
            System.out.println("Месяц " + (i + 1) + " сумма накоплений равна " + resultSum + " рублей");
        }
        //Задача 10
        System.out.println("Задача 10");
        int c = 2;//добавляем избыточности по сравнению с требованиями задачи. Данная строка позволяет сделать таблицу умножения на любое число
        System.out.println("Таблица умножения на " + c);
        for (int i = 1; i <= 10; i++) {
            System.out.println(c + "*" + i + "=" + i * c);
        }
    }}