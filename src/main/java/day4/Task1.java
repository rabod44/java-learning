package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        // System.out.println(Arrays.toString(array)); // Содержание элементов массива
        System.out.println(array.length); // Количество элементов массива
        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter8++;
        }
        System.out.println(counter8); // Чисел > 8

        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                counter1++;
        }
        System.out.println(counter1); // Чисел == 0

        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven); // Количество четных чисел

        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println(counterOdd); // Количество нечетных чисел

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) { // Перебираем все элементы массива
            sum += array[i]; // Каждый раз прибавляем значение текущего элемента массива
        }
        System.out.println(sum); // Сумма всех элементов массива
    }
}
