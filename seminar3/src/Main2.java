import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
//    Создать список типа ArrayList
//    Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("poop");
        arr.add(11);
        arr.add(7.6);
        arr.add("shite");
        arr.add("12");
        arr.add(10);
        System.out.println(arr);
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            Object o = arr.get(i);
            if (o instanceof Integer){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
        ver2(arr);
        System.out.println(arr);
    }
    private static void ver2(ArrayList<Object> arr) {
        // via Iterator
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof Integer){
                iterator.remove();
            }
        }
// myList.removeIf(o -> o instanceof Integer);
    }
}


