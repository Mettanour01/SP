import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите текст:");
        String text=scan.nextLine();
        int a = text.indexOf(".");
        int b = 0;
        while (true) {
            if (text.contains(".")) {
                char[] chArray = text.toCharArray();
                for (int i = 0; i < chArray.length; i++) {
                    char c = chArray[i];
                    if (c == '.') break;
                    if (c == ' ') b++;
                    text += Character.toString(c);
                }
                break;
            }
        }
        System.out.println("Кол-во символов:"+ a);
        System.out.println("Кол-во пробелов:"+b);
    }
}
