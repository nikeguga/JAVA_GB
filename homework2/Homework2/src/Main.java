/*class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(QUERY);

        String [] partQuery = PARAMS.split(",");
        for (int i = 0; i < partQuery.length; i++) {
            if (!partQuery[i].contains("null")){
                String part = partQuery[i];
                part = part.replaceAll("[{}\"]", "");
                String [] partPart = part.split(":");
                stringBuilder.append(partPart[0]);
                stringBuilder.append(" =");
                if(!partPart[1].matches("[0-9]*")){
                    stringBuilder.append("'");
                    stringBuilder.append(partPart[1]);
                    stringBuilder.append("'");
                }
                else {
                    stringBuilder.append(partPart[1]);
                }
                stringBuilder.append(" and");
            }
        }
        stringBuilder.delete(stringBuilder.length()-4,stringBuilder.length());
        return stringBuilder;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.PrintWriter;
class BubbleSort {

    private static FileWriter fileWriter;

    public static void createLog() {
            String fileName = "log.txt";
            try {
                PrintWriter pw = new PrintWriter(fileName);
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeLog() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLog(String logMessage) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timeStamp = dateFormat.format(new Date());
            fileWriter.write(timeStamp + " " + logMessage + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sort(int[] mas) {

        boolean isSorted = false;
        createLog();
        int buf;
        String logMessage = "";
        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < mas.length-1; i++) {

                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }

            }
            logMessage = Arrays.toString(mas);
            writeLog(logMessage);
        }
        closeLog();
    }
}