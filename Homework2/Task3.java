//3. Дана json строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String param = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        String[] changeParam = param.replace("\"", "").replace(":", " ").replace(",", " ").replace("{", "").replace("}", "").split(" ");
        //System.out.println(Arrays.toString(changeParam));

        StringBuilder stringBuilder = new StringBuilder(" ");
        System.out.println(stringBuilder);
        for (int i = 0; i < changeParam.length; i+=6) {
            System.out.println("Студент" + " " + changeParam[i+1] + " " + "получил" + " " + changeParam[i+3] + " " + "по предмету" + " " + changeParam[i+5]);
        }
    }

}
