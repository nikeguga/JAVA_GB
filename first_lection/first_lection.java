/**
 * first_lection
 */
// public class first_lection {

//     public static void main(String[]args){
//         // int a = 10; // это тип данных, но есть обёртка Integer, которая функциональнее
//         // a = --a - a--;
//         // System.out.println(a);

//         // float b = 7.4921f; // so if you use double - no need to add anything, but float must be defined with an 'f' after the number
//         // // нельзя создавать пустые переменные, код не запустится
//         // short age = 10; // this is a short number, special type of data
//         // var poop = 123; //неявная типизация, если не знаем, что использовать
//         
//        

//     }
// }

// // и это базовая программа
// massives

// public class first_lection {

//     public static void main(String[] args) {
//         // int[] array = new int[10];
//         int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int i = 0;
//         while (i < array.length)
//         {
//             System.out.println(array[i]);
//             i++;
//         }     
//         array[3] = 13;
//         System.out.println(array[3]);
        
//     }
// }

// считываем данные от пользователя
// import java.util.Scanner;

// public class first_lection{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//     }
// }

// никакой конкатенации строк! ну почти

// создать свою библиотеку универсальных методов с комментариями. Следим за тем, что у нас под классом, т.к. сказано, что статичные - плохо
// статичные - это static void .... вот это мы (почему-то) в библиотеку не закидываем, видимо, вызывать методы чаще придётся из не знаю, динамических?

// тернарники

// public class first_lection{
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b; // при выполнении условия возврат того, что до двоеточия, если нет - то, что после. Возвращается обязательно
//         System.out.println(min);
//     }
// }

// циклы while , do while , for, for in

// while - покуда, то
// do while - сначала что-то делаем, потом проверяем
// for in - используем для перебора
// for для такого-то условия

// операторы continue и break, стараемся работать без них вообще