//3. Реализовать алгоритм пирамидальной сортировки (HeapSort). (Можно использовать массивы)

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = randomNum.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(arr));

        SortArray(arr);
        System.out.println("\nОтсортированный массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void SortArray(int arr[])
    {
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            PyramSort(arr, arr.length, i);
        for (int i=arr.length-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            PyramSort(arr, i, 0);
        }
    }

    public static void PyramSort(int arr[], int n, int i)
    {
        int el = i;
        int first = 2*i + 1;
        int second = 2*i + 2;

        if (first < n && arr[first] > arr[el]) el = first;

        if (second < n && arr[second] > arr[el]) el = second;

        if (el != i)
        {
            int temp = arr[i];
            arr[i] = arr[el];
            arr[el] = temp;
            PyramSort(arr, n, el);
        }
    }
}