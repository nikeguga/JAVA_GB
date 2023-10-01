
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * В консоли запросить имя пользователя. В зависимости от текущего времени,
         * вывести приветствие вида
         * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         */
        Scanner scan = new Scanner(System.in); // привносим сканнер в код, чтобы далее считывать ввод
        System.out.println("Youe name, bitch: "); // промпт
        String name = scan.nextLine(); // считали инпут, записали в переменную
        LocalTime time = LocalTime.now(); // завели текущее время в программу
        int hour = time.getHour();    // завели текущий час в переменную
        if (hour >= 5 && hour < 12) {
            System.out.println("Good morning, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good day, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Good evening, " + name + "!");
        } else {
            System.out.println("Good night, " + name + "!");
        }
        //важно, методы пишем не в main, но внутри класса
    }
}



