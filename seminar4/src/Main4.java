import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
//        Написать метод, который принимает массив элементов, помещает их в стэк
//        и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов, помещает их
//        в очередь и выводит на консоль содержимое очереди.
        testQueue();
    }
    private static void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

// System.out.println(stack);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    private static void testQueue(){
        Queue<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);

        while (!list.isEmpty()){
            System.out.println(list.poll());
        }
    }
}
