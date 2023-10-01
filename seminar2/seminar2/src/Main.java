import java.util.Scanner;

public class Main {
    static String yourString(int n, char a, char b) {
        /*String res = "";

        for (int i = 0; i <= (n-1)/2; i++) {
            res += Character.toString(a) + Character.toString(b);
        }
*/
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <n/2 ; i++) {
            build.append(a);
            build.append(b);
        }
        return build.toString();
    }
    public static void main(String[] args) {
        //дано четное число N (>0) и символы с1 и с2. Нужен метод, который вырнет строку длины N которая состоит из
        //чередующихся символов с1 и с2 начиная с с1


        System.out.println("Input a numbre:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Input a char:");
        String c1 = scan.next();
        char s1 = c1.charAt(0);
        System.out.println("Input a char:");
        String c2 = scan.next();
        char s2 = c2.charAt(0);
        if (n% 2 == 0){
            System.out.println(yourString(n, s1, s2));
        }
        else {
            System.out.println("MISTAKE");
        }
    }
}