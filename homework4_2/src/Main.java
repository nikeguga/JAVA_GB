import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private Deque<Integer> resultsStack = new ArrayDeque<>();

    public int calculate(char op, int a, int b) {
        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Деление на ноль недопустимо.");
                }
                break;
            case '<':
                if (resultsStack.size() >= 2) {
                    // Если есть хотя бы два результата, извлекаем последний и возвращаем предпоследний
                    resultsStack.pop(); // Извлекаем последний результат
                    return resultsStack.peek(); // Возвращаем предпоследний результат без удаления
                } else {
                    System.out.println("Недостаточно операций для отмены.");
                    return 0; // Возвращаем 0 в случае ошибки
                }
            default:
                System.out.println("Недопустимая операция: " + op);
        }

        resultsStack.push(result); // Добавляем результат операции в стек
        return result;
    }
}