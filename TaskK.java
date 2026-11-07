import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int distinctCount = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                distinctCount++;
            }
        }
        System.out.println(distinctCount);
    }
}

