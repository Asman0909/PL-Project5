import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                if (element % 2 == 0) {
                    System.out.print(element + " ");
                }
            }
        }
    }
}
