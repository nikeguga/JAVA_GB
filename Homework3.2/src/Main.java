import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Сортировка массива по возрастанию
        Arrays.sort(arr);

        // Вывод отсортированного массива
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Нахождение минимального и максимального значений
        int min = arr[0];
        int max = arr[arr.length - 1];

        // Вычисление среднего арифметического
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        int average = sum / arr.length;

        // Вывод результатов
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);
    }

}

