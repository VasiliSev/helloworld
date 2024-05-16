import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        //Произвольный массив для первой задачи
        int[] arrayOne = new int[]{10000, 22000, 37000, 18000, 28000};
        int sum1 = 0;
        for (int j : arrayOne) {
            sum1 += j;
        }
        System.out.println("Сумма трат за месяц составила "+sum1);
        System.out.println();

        System.out.println("Задача 2");

        //Произвольный массив для второй задачи
        int[] arrayTwo = new int[5];
        arrayTwo[0] = 25000;
        arrayTwo[1] = 38000;
        arrayTwo[2] = 42000;
        arrayTwo[3] = 35000;
        arrayTwo[4] = 78000;

        int min = 100000;
        int max = 0;
        for (int element : arrayTwo) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная трата за месяц составила "+min+", максимальная - "+max);
        System.out.println();

        System.out.println("Задача 3");

        //Произвольный массив для третьей задачи
        int[] arrayThree = new int[]{39000, 48000, 94000, 62000, 71000};
        int numbersOfWeeks = 5;
        int sum3 = 0;
        for (int element : arrayThree) {
            sum3 += element;
        }
        float averageWaste = (float) sum3 /numbersOfWeeks;
        String result = String.format("%.2f",averageWaste);
        System.out.println("Средняя сумма трат составила "+result);
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = {'n','a','v','I',' ', 'v','o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }
    }


