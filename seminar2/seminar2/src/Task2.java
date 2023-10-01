import java.util.Scanner;

public class Task2 {

    static String squeezeString(String a) {
        StringBuilder squeezer = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length()-1; i++) {

            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
            }
            else  {
                squeezer.append(a.charAt(i));
                if (count > 1) {
                    squeezer.append(count);
                }
                count = 1;
            }

        }
        squeezer.append(a.charAt(a.length()-1));
            if(count >1){
                squeezer.append(count);
            }

        return squeezer.toString();
    }

    public static void main(String[] args) {
        // нужен метод, который сжимает строку. ввод aaaabbbcdd, вывод a4b3cd2
        Scanner scan = new Scanner(System.in);
        System.out.println("input your string: ");
        String a = scan.next();
        System.out.println(squeezeString(a));
    }
}
