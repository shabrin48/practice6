package practrice6;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angles;

        System.out.println("Введіть кількість кутів многокутника: ");
        int n = scanner.nextInt();

        angles = new int[n];
        int sum = 0;

        System.out.println("Введіть градуси кутів: ");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int w = 180 * (n - 2);

        if (sum == w) {
            System.out.println("Такий многокутник може існувати");
        } else {
            System.out.println("Такий многокутник НЕ може існувати");
        }

        scanner.close();
    }
}
