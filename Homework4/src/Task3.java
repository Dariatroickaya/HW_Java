//3.* В калькулятор добавьте возможность отменить последнюю операцию

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        ArrayList<Object> arrayCalculate = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        arrayCalculate.add(input.nextLine());

        System.out.print("Выберите арифметическое действие: (+, -, *, /): ");
        arrayCalculate.add(input.nextLine());

        System.out.print("Введите второе число: ");
        arrayCalculate.add(input.nextLine());


        System.out.print("Желаете изменить арифметическое действие? y/n: ");
        String newOperation = input.nextLine();

        if (Objects.equals(newOperation, "y")){
            System.out.print("Выберите арифметическое действие: (+, -, *, /): ");
            arrayCalculate.set(1, input.nextLine());
            calculator(arrayCalculate);
        }
        else{
            calculator(arrayCalculate);
        }
    }
    private static void calculator(ArrayList<Object> array) {
        int firstNumber = Integer.parseInt((String) array.get(0));
        int secondNumber = Integer.parseInt((String) array.get(2));
        switch ((String) array.get(1)) {
            case "+" -> {
                int result = firstNumber + secondNumber;
                array.add(result);
                System.out.print(result);
            }
            case "-" -> {
                int result = firstNumber - secondNumber;
                array.add(result);
                System.out.print(result);
            }
            case "*" -> {
                int result = firstNumber * secondNumber;
                array.add(result);
                System.out.print(result);
            }
            case "/" -> {
                if (secondNumber != 0) {
                    int result = firstNumber / secondNumber;
                    array.add(result);
                    System.out.print(result);
                }
                else {
                    System.out.print("Делить на ноль нельзя\n");
                }
            }
            default -> System.out.print("Ошибка");
        }

    }
}