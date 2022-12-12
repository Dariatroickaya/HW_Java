//Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = input.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = input.nextInt();

        System.out.print("Выберите арифметическое действие: (+, -, *, /): ");
        String arithmetic_operation = input.next();

        switch (arithmetic_operation) {
            case "+" -> System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
            case "-" -> System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
            case "*" -> System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
            case "/" -> System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
            default -> System.out.print("Ошибка!");
        }
    }
}