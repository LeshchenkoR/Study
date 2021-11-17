package Module3;

import java.util.Arrays;

public class Task_A1 {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            if ((i + 1)%2 == 0) {
                numbers[i] = -numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
