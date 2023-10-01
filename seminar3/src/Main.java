import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.

        ArrayList <Integer> arr = new ArrayList<Integer> ();
        Random poop = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(poop.nextInt(60, 70));
        }
        System.out.println(arr);
        arr.sort(null); // null for natural order. sort is prewritten method, so no need in bubble sort or whatever
        System.out.println();
        System.out.println(arr);




        }

    }
