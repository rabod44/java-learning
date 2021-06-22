package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(1000);

        int max = 0;
        for (int element : array) { // Проход по каждому элементу массива
            if (element > max)
                max = element;
        }
        // System.out.println(Arrays.toString(array)); // Вывод содержания массива
        System.out.println(max); // Вывод максимального числа

        int min = 10000;
        for (int element : array) {
            if (element < min)
                min = element;
        }
        System.out.println(min); // Вывод минимального числа

        int counter = 0;
        for (int element : array) {
            if (element % 10 == 0)
                counter++;
        }
        System.out.println(counter); // Количество элементов, заканчивающихся на 0

        int sum = 0;
        for (int element : array) {
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(sum); // Сумма элементов, заканчивающихся на 0
    }
}
