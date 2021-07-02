package day4;
/* Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки,
сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)  */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0; // Сумму чисел в строке запишем в эту переменную
        int maxSumIdx = 0; // Запишем сюда индекс строки с наибольшей суммой

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
  // -------------------------------------
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // вычисляем сымму элементов для каждой из строк
            }
  // ------------------------------------ ЧТО ЗДЕСЬ ПРОИСХОДИТ?
            if (sum >= maxSum) { // если сумма в строке больше 0 - записываем это значение в maxSum
                maxSum = sum; // ?????
                maxSumIdx = i; // ??????
            }
  // --------------------------------------
        }
        System.out.println(maxSumIdx);
    }
}













// public class Task3 {
//    public static void main(String[] args) {
//        int[][] matrix = new int[12][8]; // Создаем двумерный массив
//        Random random = new Random(); // Инициализируем класс для создания множества случайных чисел
//        for (int i = 0; i < matrix.length; i++) { // Проходим по сторокам 0 - 12
//            for (int j = 0; j < matrix[i].length; j++) { // Проходим по содержимому каждой строки 0 - 8
//                matrix[i][j] = random.nextInt(50); // Заполняем случайными числами от 0 до 50
//                System.out.print(matrix[i][j] + "\t"); // Вывод содержимого массива
//            }
//            System.out.println(); // Добавляем пробел между строками
//        }
//        int maxSum = 0; // Сумму чисел в строке запишем в эту переменную
//        int maxSumIdx = 0; // Запишем сюда индекс строки с наибольшей суммой
//        for (int i = 0; i < matrix.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//
//            if (sum >= maxSum) {
//                maxSum = sum;
//                maxSumIdx = i;
//            }
//        }
//        System.out.println(maxSumIdx);
//    }
//}
