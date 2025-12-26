package practiceІІ6;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        main1(args);
    }

    public static void main1(String[] args) {
        Random rn = new Random();
        int[] arr = new int[25];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1, 150);
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Масив: " + Arrays.toString(arr));
        System.out.printf("Чётных: %d%nНе чётных: %d", even, odd);
    }
}
