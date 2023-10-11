import java.util.*;

public class Main3 {
    public static void main(String[] args) {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
//        а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

        List <String> arr = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean fin = true;
        while (fin){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = arr.listIterator(arr.size()); // т.к. стоит за гранью коллекции и получит последний элемент в аргумент
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }

                    break;
                case "revert":
                    arr.remove(arr.size()-1);
                    break;
                case "finish":
                    fin = false;
                    break;
                default:
                    arr.add(line);
            }
        }
    }
}
