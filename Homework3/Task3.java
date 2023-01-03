//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(randomNum.nextInt(0, 10));
        }
        System.out.println("Целочисленный список: " + array);
        System.out.println("Минимальное число: " + Collections.min(array));
        System.out.println("Максимальное число: " + Collections.max(array));

        int Sum = 0;
        for (int i = 0; i < size; i++) {
            Sum += i;
        }
        double Average = (double) Sum / size;
        System.out.println("Среднее арифметическое: " + Average);
    }
}