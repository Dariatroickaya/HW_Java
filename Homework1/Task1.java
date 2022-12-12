//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();

        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += i;
        }

        int count2 = 1;
        for (int j = 1; j <= n; j++) {
            count2 *= j;
        }

        System.out.printf( "треугольное число, %s", count);
        System.out.println();
        System.out.printf("факториал, %s", count2);
    }
}

