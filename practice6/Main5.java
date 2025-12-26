package practice6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масива: ");
        int size_array = scanner.nextInt();
        int[] array = new int[size_array];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1, 100);
        }
        System.out.println("Масив: " + Arrays.toString(array));

        System.out.println("Що перевірити?");
        System.out.println("1 - Зростання");
        System.out.println("2 - Спадання");
        int choice = scanner.nextInt();

        boolean isOrdered = true;

        if (choice == 1) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println("Масив зростаючий: " + isOrdered);

        } else if (choice == 2) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println("Масив спадний: " + isOrdered);
        } else {
            System.out.println("Неправильний вибір!");
        }

        scanner.close();
    }
}
