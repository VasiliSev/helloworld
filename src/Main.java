import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] arrInt = new int[]{1, 2, 3};
        float[] arrFloat = {1.57f, 7.654f, 9.986f};
        long[] arrLong = new long[10];
        for (int i = 0; i < arrLong.length; i++) {
            arrLong[i] = (i + 1) * 5;
        }
        System.out.println();

        System.out.println("Задача 2");
        System.out.println("Массив 1 - целочисленный");
        for (int i = 0; i < arrInt.length-1; i++) {
            System.out.print(arrInt[i]+", ");
        }
        System.out.print(arrInt[arrInt.length-1]);
        System.out.println();
        System.out.println("Массив 2 - с плавающей точкой");
        for (int i = 0; i < arrFloat.length; i++) {
             if (i == arrFloat.length-1) {
                 System.out.println(arrFloat[i]);
                 break;
             }
            System.out.print(arrFloat[i]+", ");
            }
        System.out.println();
        System.out.println("Массив 3 - произвольный");
        for (int i = 0; i < arrLong.length; i++) {
            if (i == arrLong.length-1){
                System.out.println(arrLong[i]);
                break;
            }
            System.out.print(arrLong[i]+", ");
        }
        System.out.println();

        System.out.println("Задача 3");
        System.out.println("Массив 1 в обратном порядке");
        for (int i = arrInt.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i]+", ");
        }
        System.out.println();
        System.out.println("Массив 2 в обратном порядке");
        for (int i = arrFloat.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(arrFloat[i]);
                break;
            }
            System.out.print(arrFloat[i]+", ");
        }
        System.out.println();
        System.out.println("Массив 3 в обратном порядке");
        for (int i = 0; i < arrLong.length; i++) {
            if (i == arrLong.length - 1) {
                System.out.println(arrLong[arrLong.length - 1 - i]);
                break;
            }
            System.out.print(arrLong[arrLong.length - 1 - i] + ", ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0){
                arrInt[i] = arrInt [i]+1;
            }
        }
            System.out.println(Arrays.toString(arrInt));
    }
    }


