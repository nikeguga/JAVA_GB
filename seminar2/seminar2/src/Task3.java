import java.util.Scanner;

public class Task3 {

    static boolean isPaly(String a) {
        /*char[] wordles = a.toCharArray();
        int middle = wordles.length / 2;
        int i = 0;
        int j = wordles.length - 1;
        boolean res = true;
        while (i < middle && j > middle) {
            if (wordles[i] == wordles[j]) {
                i++;
                j--;
            } else {
                res = false;
                break;
            }
        } */

        // or
        StringBuilder poopy = new StringBuilder(a);
        String b = poopy.reverse().toString();
        boolean res = a.equals(b);

        return res;
    }

    public static void main(String[] args) {
        //эта строка - палиндром?
        Scanner scan = new Scanner(System.in);
        System.out.println("check yor string for palindromacy: ");
        String mayBePoly = scan.next();
        mayBePoly = mayBePoly.toLowerCase(); // приводим все к нижнему регистру
        mayBePoly = mayBePoly.replaceAll("\\s", ""); // убираем пробелы
        if (isPaly(mayBePoly) == true) {
            System.out.println("your string is paly");
        } else {
            System.out.println("no paly here");
        }
    }
}
