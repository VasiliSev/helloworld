import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        //Массив целочисленных данных
        int[] arrayInt = new int[]{1, 2, 3};

        //Массив данных с дробной частью - float
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        //Произвольный массив - в данном случае, с данными типа Long
        long[] arrayLong = new long[10];
        for (int i = 0; i < arrayLong.length; i++) {
            arrayLong[i] = (i + 1) * 5;
        }
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Массив 1 - целочисленный");
        for (int i = 0; i < arrayInt.length-1; i++) {
            System.out.print(arrayInt[i]+", ");
        }
        System.out.print(arrayInt[arrayInt.length-1]);
        System.out.println();
        System.out.println("Массив 2 - с плавающей точкой");
        for (int i = 0; i < arrayFloat.length-1; i++) {
            System.out.print(arrayFloat[i] + ", ");
        }
        System.out.println(arrayFloat[arrayFloat.length-1]);
        System.out.println();
        System.out.println("Массив 3 - произвольный");
        for (int i = 0; i < arrayLong.length-1; i++) {
            System.out.print(arrayLong[i]+", ");
        }
        System.out.println(arrayLong[arrayLong.length-1]);
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Массив 1 в обратном порядке");
        for (int i = arrayInt.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i]+", ");
        }
        System.out.println();
        System.out.println("Массив 2 в обратном порядке");
        for (int i = arrayFloat.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrayFloat[i]);
                break;
            }
            System.out.print(arrayFloat[i]+", ");
        }
        System.out.println();
        System.out.println("Массив 3 в обратном порядке");
        for (int i = arrayLong.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayLong[i]);
                break;
            }
            System.out.print(arrayLong[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0){
                arrayInt[i] = arrayInt [i]+1;
            }
        }
            System.out.println(Arrays.toString(arrayInt));
        System.out.println();
    }
    }


