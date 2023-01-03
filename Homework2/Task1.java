//1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.Objects;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String param = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] changeParam = param.replace("\"", "").replace(":", " ").replace(",", "").replace("{", "").replace("}", "").split(" ");
        //System.out.println(Arrays.toString(changeParam));

        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        String temp;
        for (int i = 0; i < changeParam.length; i += 2) {
            if (i != 0) {
                temp = " AND ";
            } else {
                temp = "";
            }
            if (!Objects.equals(changeParam[i + 1], "null")) {
                stringBuilder.append(temp).append(changeParam[i]).append(" ").append(changeParam[i + 1]);
            }
        }
        System.out.println(stringBuilder);
    }
}