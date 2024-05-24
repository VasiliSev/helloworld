import java.time.LocalDate;

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
    public static void choiceOfAppVersion(int yearOfProductionDevice, byte OS) {
        switch (OS) {
            case (1):
                if (yearOfProductionDevice < LocalDate.now().getYear()) {
                    System.out.println("Установите облегченную версию приложения для ОС Android");
                } else {
                    System.out.println("Установите полную версию приложения для ОС Android");
                }
            break;
            case (0):
                if (yearOfProductionDevice < LocalDate.now().getYear()) {
                    System.out.println("Установите облегченную версию приложения для iOS");
                } else {
                    System.out.println("Установите полную версию приложения для iOS");
                }
            break;
            default:
                System.out.println("Укажите тип операционной системы");
        }
    }

        //метод для задачи 3
        public static int daysForDelivery(int dist){
            int time = 1;
            if (dist > 100) {
                return -1;
            } else if (dist <= 20) {
                return time;
            } else if (dist <= 60) {
                return time + 1;
            } else return time + 2;
        }

        public static void main (String[]args){

            System.out.println("Задача 1 Методы");
            int checkYear = 1980;
            checkYearToLeap(checkYear);

            System.out.println();

            System.out.println("Задача 2 Методы");
            int yearOfProductionClientDevice = 2010;
            byte clientOS = 1;
            choiceOfAppVersion(yearOfProductionClientDevice, clientOS);

            System.out.println();

            System.out.println("Задача 3 Методы");
            int myDistance = 70;
            int timeOfDelivery = daysForDelivery(myDistance);
            System.out.println("Время доставки составляет " + timeOfDelivery + " дней (-1 - доставка не осуществляется)");
        }
    }


