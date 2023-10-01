public class Task2 {
    public static void main(String[] args) {
        // дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1]
        // нужно вывести максимальное количесто идущих подряд единиц
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            }
        else {
            count = 0;
            }
        }
        System.out.printf("Your score is: %s", max);
    }
}
