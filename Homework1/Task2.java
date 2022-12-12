//Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {

        for (int j = 2; j <= 1000; j++) {
            boolean simplenumber = false;

            for (int i = 2; i * i <= j; i++) {
                simplenumber = (j % i == 0);
                if (simplenumber) {
                    break;
                }
            }
            if (!simplenumber) {
                System.out.print(j + " ");
            }
        }
    }
}