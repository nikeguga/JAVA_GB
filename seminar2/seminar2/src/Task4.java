import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    // метод, который составит строку из 100 повторений слова TEST и метод, который запишет его в текстовый файл
    // нужно обработать исключения
    // сюда же бахнем логгер
    static Logger logger = Logger.getAnonymousLogger(); // лучше всего записывать логгер в мэйн на уровне класса, создаем объект класса Logger

    public static void main(String[] args) {
        String filePath = "src/test.txt";
        String logPath = "src/testLog.txt";
        String s = "TEST ";
        int count = 100;
        createLogger(logPath);
        String temp = rep(s, count);
        fileCreate(filePath, temp);
        closeLogger();
    }

    static void createLogger(String logPath) {
        SimpleFormatter formatter = new SimpleFormatter(); // форматируем вывод лога
        FileHandler handler = null; // нужно создать хэндлер для логгера
        try {
            handler = new FileHandler(logPath, true); //тру позволяет дописывать лог при каждом цикле
            handler.setFormatter(formatter); // подключаем форматтер к хэндлеру, который подключен к логгеру
            logger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){  //здесь мы закрываем логгер файл, чтобы не завис
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static String rep(String a, int count) {
        return a.repeat(count); // метод стринга на повторение
    }

    static void fileCreate(String filePath, String a) {
        // на случай ошибок делаем блок трай - кэтч. Это позволит продолжить работу программе если есть ошибка
        try (FileWriter writer = new FileWriter(filePath)) {
            ; // в трай записываем нужное
            writer.write(a); // текст в буффере
            writer.flush(); // а это из буффера закидывает в файл (полноценная запись)
            logger.info("success");
            //writer.close(); // отключаемся от файла, также включает в себя flush не обязательно, если в трай в скобках старт
        } catch (Exception e) {// в кэтч ловим исключения. Если не будет кэтч - ошибка будет лететь вечность. Что
            // важно: в кэтч можно указать тип ошибки, если ставить просто Эксепшн - ловит все типы
            e.printStackTrace(); // выведет стэк ошибки в консоль, какая проблема в какой строке
            System.out.println("Запись не удалась");
            logger.warning("shit " + e);
        }
    }
}
