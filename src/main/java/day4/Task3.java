package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) { // Проходим по сторокам 0 - 12
            for (int j = 0; j < matrix[i].length; j++) { // Проходим по содержимому каждой строки 0 - 8
                matrix[i][j] = random.nextInt(50); // Заполняем случайными числоми
            }
        }
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);
    }
}
