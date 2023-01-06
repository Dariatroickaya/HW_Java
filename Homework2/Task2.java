//2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNum.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(array));

        Sorting(array, size);
        System.out.println(Arrays.toString(array));
    }

    public static void Sorting(int[] array, int size) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.log(Level.INFO, Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
    }
}