import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        reverse(arr, 0, n - k - 1); // 1. Первую часть
        reverse(arr, n - k, n - 1); // 2. Вторую часть
        reverse(arr, 0, n - 1);     // 3. Весь массив целиком
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

