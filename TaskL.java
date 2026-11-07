import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int petyaHeight = scanner.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (heights[i] < petyaHeight) {
                position = i + 1; // нумерация с 1
                break;
            }
        }
        System.out.println(position);
    }
}
