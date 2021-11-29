public class Main {
    public static void main(String[] args) {
        int mass[] = new int[]{2, 5, 2, 8, 5, 6, 8, 8};
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] < mass[j+1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
        for (Integer m : mass){
            System.out.print(m + " ");
        }
        System.out.println();
    }
}