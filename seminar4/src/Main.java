import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
//            Сравните с предыдущим.

        List<Integer> list1 = new ArrayList<>(); // быстрее наполняет, медленнее изменяет, но по индексу быстрее
        List<Integer> list2 = new LinkedList<>(); // медленнее наполняет, быстрее изменяет начало, но не по индексу
        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        long timeFinish1 = System.currentTimeMillis();
        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long timeFinish2 = System.currentTimeMillis();
        System.out.println("List1: " + (timeFinish1 - timeStart1));
        System.out.println("List2: " + (timeFinish2 - timeStart2));
    }
}