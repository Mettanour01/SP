
public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 6, 5, 1, 9, 3, 8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = array.length - 1; k > i; k--) {
                if (array[k - 1] > array[k]) {
                    int tmp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = tmp;
                }
            }
        }
    }
}

