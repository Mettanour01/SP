import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        if (num1 == 0 || num2 == 0) {
            System.out.println("произведение равно: 0");
        }
        result = getResult(result, num1, num2);
        System.out.println("Результат умножения равен: " + result);
    }

    private static int getResult(int result, int num1, int num2) {
        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        return result;
    }
}
