import java.lang.reflect.Array;
import java.util.Scanner;

public class Task3 {
    public static int[] newArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input length: ");
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input array item: ");
            int digit = scan.nextInt();
            array[i] = digit;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int[] someSort(int[] arr, int val) {
        int[] res = new int[arr.length];

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != val) {
                res[j] = arr[i];
                j++;
                i++;
            }
            else {
                i++;
            }

        }
       for(j = 0; j<res.length; j++){
           if(res[j] == 0){
               res[j] = val;
           }

       }
        return res;
    }

    public static void main(String[] args) {
//        Дан массив nums = [3,2,5,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны
//        от заданного, а остальные - равны ему.
        int[] arr = newArray();
        printArray(arr);
        System.out.println();
        System.out.println("Input a numbre: ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        int[] result = someSort(arr, val);
        printArray(result);
    }
}
