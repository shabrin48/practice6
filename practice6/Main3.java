package practice6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    final static int MAX_ARRAY_SIZE = 100;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int size_array;

        do {
            System.out.printf("Введіть розмір масива (1, %d): ", MAX_ARRAY_SIZE);
            size_array = sc.nextInt();
        } while (size_array < 1 || size_array > MAX_ARRAY_SIZE);

        int[] array = new int[size_array];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 250);
        }
        System.out.println("Масив з випадковими числами: " + Arrays.toString(array));

        System.out.print("Введіть число, яке хочете змінити: ");
        int user_number = sc.nextInt();

        System.out.print("Введіть число, на яке хочете змінити: ");
        int user_replace_number = sc.nextInt();

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == user_number) {
                array[i] = user_replace_number;
                isFound = true;
                break; // міняє тільки перше знайдене
            }
        }

        if (isFound) {
            System.out.printf(
                    "Число (%d) знаходиться в масиві та змінене на (%d)%n",
                    user_number, user_replace_number
            );
            System.out.println("Змінений масив: " + Arrays.toString(array));
        } else {
            System.out.printf("Числа (%d) нема в масиві%n", user_number);
        }

        sc.close();
    }
}
