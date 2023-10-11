import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке
//        и удаляет её из списка.

        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            String[]partLine = line.split("~");
            String text = partLine[0];
            String num = partLine[1];
            int pos = Integer.parseInt(num);
            switch (text){
                case "print":
                    System.out.println(list.remove(pos));
                    break;
                case "finish":
                    return;
                default:
                    list.add(pos, text);
            }
        }

    }
}
