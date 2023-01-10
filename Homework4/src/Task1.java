//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;


public class Task1 {
    public static void main(String[] args) {

        LinkedList<String> array = new LinkedList<>();
        array.add("Реализуйте");
        array.add("метод");
        array.add("который");
        array.add("вернет");
        array.add("'перевернутый'");
        array.add("список");

        System.out.println(array);
        Iterator i = array.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}