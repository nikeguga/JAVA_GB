public class Task4 {
    public static void main(String[] args) {
//        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

        String welcome = "Добро пожаловать на курс по Java";
        String[] words = welcome.split(" ");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i] + " ";
        }
        System.out.println(reverse.trim()); // trim - убирает лишние пробелы
    }
}
