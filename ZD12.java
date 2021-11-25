import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void p(String эсамэска){
        System.out.println(эсамэска);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, columns, index = 0;

        p("Введите кол-во строк :\n> ");
        rows = sc.nextInt();

        p("Введите кол-во столбцов:\n> ");
        columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        p("Введите максимум для генератора чисел:\n> ");
        int N = sc.nextInt();

        int[] array2 = new int[rows * columns];

        p("Матрица:");
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                array[i][j] = ThreadLocalRandom.current().nextInt(N + 1);
                System.out.print(array[i][j] + " ");
                array2[index++] = array[i][j];
            }
            System.out.println();
        }
        p("\nArray2: " + Arrays.toString(array2));
    }
}
