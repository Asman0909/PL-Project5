import java.util.ArrayList;
import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(scanner.nextInt());
        }
        int destroyedTotal = 0;
        boolean removed = true;
        while (removed) {
            removed = false;
            int i = 0;
            while (i < balls.size()) {
                int j = i;
                while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                    j++;
                }
                int length = j - i;
                if (length >= 3) {
                    for (int k = 0; k < length; k++) {
                        balls.remove(i);
                    }
                    destroyedTotal += length;
                    removed = true;
                    i = Math.max(0, i - 1);
                } else {
                    i = j;
                }
            }
        }
        System.out.println(destroyedTotal);
    }
}
