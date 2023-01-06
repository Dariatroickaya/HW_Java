//2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(randomNum.nextInt(0, 10));
        }
        System.out.println("Список целых чисел: " + array);
        array.removeIf(Integer -> Integer % 2 == 0);
        System.out.println("Нечетные числа: " + array);
    }

}