//4*. К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task4.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log2.log");
        fh.setFormatter(new SimpleFormatter());

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = input.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = input.nextInt();

        System.out.print("Выберите арифметическое действие: (+, -, *, /): ");
        String arithmetic_operation = input.next();

        int result = 0;
        logger.addHandler(fh);

        switch (arithmetic_operation) {
            case "+" -> System.out.printf("%d + %d = %d", firstNumber, secondNumber, result = firstNumber + secondNumber);
            case "-" -> System.out.printf("%d - %d = %d", firstNumber, secondNumber, result = firstNumber - secondNumber);
            case "*" -> System.out.printf("%d * %d = %d", firstNumber, secondNumber, result = firstNumber * secondNumber);
            case "/" -> {
                if (secondNumber != 0) {
                    System.out.printf("%d / %d = %d", firstNumber, secondNumber, result = firstNumber / secondNumber);
                } else {
                    System.out.println("Делить на ноль нельзя");
                }
            }
            default -> System.out.print("Ошибка!");
        }
        logger.log(Level.INFO,firstNumber + " " + arithmetic_operation + " " + secondNumber + " = " + result + "\n");
    }
}