// traingle number (if number = 4, we go with sum 1 + 2 + 3 + 4)

//class Answer {
//    public int countNTriangle(int n){
//        // Введите свое решение ниже
//int res = 0;
//        for (int i = 1; i <= n ; i++) {
//            res += i;
//        }
//
//        return res;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int n = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            n = 4;
//        }
//        else{
//            n = Integer.parseInt(args[0]);
//        }
//
//        // Вывод результата на экран
//        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n);
//        System.out.println(itresume_res);
//    }
//}

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа
// в промежутке от 1 до 1000, каждое на новой строке.
//class Answer {
//    public static void printPrimeNums() {
//
//        for (int i = 1; i <= 1000; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//
//        Answer ans = new Answer();
//        ans.printPrimeNums();
//    }
//}

import java.util.Scanner;

// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и
// возвращать результат. В классе должен быть метод calculate, который принимает оператор и значения аргументов
// и возвращает результат вычислений.
//
//При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже

        int result = 0;

        if (op == '+'){
            result = a + b;
            return result;
        } if (op == '-') {
            result = a - b;
            return  result;
        } if (op == '*') {
            result = a * b;
            return result;
        } if (op == '/') {
            result = a / b;
            return result;
        } else {
            result = 19000;
            return result;
        }


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        if(result != 19000) {
            System.out.println(result);
        }
        else {
            System.out.println("Некорректный оператор: 'оператор'");
        }
    }
}