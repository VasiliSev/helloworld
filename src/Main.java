public class Main {

    //метод для задачи 1
    public static void checkYearToLeap(int year) {
        if (year < 1584) {
            System.out.println(year + " год относится к эпохе, когда не было понятия високосный год");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //метод для задачи 2
    public static void choiceOfOperationSystem(int year, byte OS) {
        if (OS == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для ОС Android");
            } else {
                System.out.println("Установите полную версию приложения для ОС Android");
            }
        } else if (year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else {
            System.out.println("Установите полную версию приложения для iOS");
        }
    }

    //метод для задачи 3
    public static int daysForDelivery(int dist) {
        int time = 1;
        if (dist > 100) {
            return -1;
        } else if (dist <= 20) {
            return time;
        } else if (dist <= 60) {
            return time + 1;
        } else return time + 2;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1 Методы часть 1");
        int checkYear = 1980;
        checkYearToLeap(checkYear);

        System.out.println();

        System.out.println("Задача 2 Методы часть 1");
        int yearOfProductionClientDevice = 2024;
        byte clientOS = 1;
        choiceOfOperationSystem(yearOfProductionClientDevice, clientOS);

        System.out.println();

        System.out.println("Задача 3 Методы часть 1");
        int myDistance = 70;
        int timeOfDelivery = daysForDelivery(myDistance);
        System.out.println("Время доставки составляет " + timeOfDelivery + " дней (-1 - доставка не осуществляется)");
    }
}


