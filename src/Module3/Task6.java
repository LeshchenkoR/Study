package Module3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Введите слово для инверсии: ");
            String word = scanner.nextLine();
            isCorrectName = checkName(word);
            if (!isCorrectName) {
                System.out.println("введите только одно слово");
            } else {
                System.out.println(reverseWord(word));
            }
        }
    }

    private static boolean checkName(String word) {
        if (word.split(" ").length == 1) {
            return true;
        } else return false;
    }

    private static String reverseWord(String word) {
        String reverce = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverce += word.charAt(i);
        }
        return reverce;
    }
}
