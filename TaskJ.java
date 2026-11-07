import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int max = scanner.nextInt();
            for (int i = 1; i < n; i++) {
                int current = scanner.nextInt();
                if (current > max) {
                    max = current;
                }
            }
            System.out.println(max);
        }
    }
}
