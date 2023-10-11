import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // Метод для добавления элемента в конец очереди
    public void enqueue(T element) {
        queue.addLast(element);
    }

    // Метод для получения и удаления первого элемента из очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Метод для получения первого элемента из очереди без удаления
    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Метод для получения всех элементов в очереди
    public LinkedList<T> getElements() {
        return new LinkedList<>(queue);
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Метод для получения размера очереди
    public int size() {
        return queue.size();
    }
}


