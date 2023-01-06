//2. Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
//        (Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)

import java.util.*;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        Task2Queue queue = new Task2Queue();
        queue.enqueue(123);
        queue.enqueue(234);
        queue.enqueue(345);
        System.out.println(queue.get());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.get());
    }
}


public class Task2Queue {
    LinkedList<Integer> arr = new LinkedList<>();

    public void enqueue(int item) {
        arr.add(item);
    }

    public int dequeue() {
        int temp = arr.get(0);
        arr.remove(0);
        return temp;
    }

    public int first() {
        return arr.get(0);
    }

    public LinkedList<Integer> get() {
        return arr;
    }
}

