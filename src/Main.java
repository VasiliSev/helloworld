public class Main {
    public static void main(String[] args) {
        //задача 1 с выполнением условия о введении числовой переменной
        byte clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите приложение для ОС Android по ссылке");
        } else {
            System.out.println("Установите приложение для iOS по ссылке");
        }

        //задача 1 с использованием символьной переменной
        char opSys = 'z';
        if (opSys == 'A') {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (opSys == 'i') {
            System.out.println("Установите приложение для iOs по ссылке");
        } else {
            System.out.println("Выберите тип операционной системы Вашего устройства");
        }

        //задача 2
        int yerOfProd = 2018;//год выпуска телефона пользователя
        byte clientOS = 1; //компиллятор отказался читать эту переменную из первой задачи, поэтому пришлось инициировать ее снова
        if (clientOS == 1) {
            if (yerOfProd < 2015) {
                System.out.println("Установите облегченную версию приложения для ОС Android");
            } else {
                System.out.println("Установите полную версию приложения для ОС Android");
            }
        } else if (yerOfProd < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else {
            System.out.println("Установите полную версию приложения для iOS");
        }
        //задача 3
        int year = 2000;
        if (year < 1584) {
            System.out.println(year + " год относится к эпохе, когда не было понятия високосный год");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //задача 4
        int deliveryDistance = 110;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }
        //задача 5
        byte mounth = 8;
        switch (mounth) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}

