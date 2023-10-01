import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
//        Каталог товаров книжного магазина сохранен в виде двумерного списка
//        List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
//        содержится название жанра, а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры.

//        [
//        ["роман", " война и мир"],
//        ["сказки", "колобок", "Иван-пидорок"],
//        ["научная фантастика", "прекрасная Россия будущего"],
//        ]
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказки", "колобок");
        addBook(shopBook, "сказки", "Иван-пидорок");
        addBook(shopBook, "научная фантастика", "прекрасная Россия будущего");
        addBook(shopBook, "научная фантастика", "Путин - великий");
        addBook(shopBook, "научная фантастика", "Патрушев не сдохнет");
        addBook(shopBook, "роман", "Попка Кириенко");
        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook) {
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i); // делаем сублист
            String curGenre = curList.get(0); // вводим жанр
            if (curGenre.equals(genre)) {// проверяем был ли уже этот жанр, если да - добавляем наименование книги
                if (!curList.contains(nameBook)){ // проверяем, не добавляли ли уже книгу
                    curList.add(nameBook);
                }

                return;
            }
        }
        List<String> list = new ArrayList<>(); // генерация субсписков
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);

    }
}

