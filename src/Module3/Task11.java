package Module3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Поставьте оценку от 1 до 5: ");
        String rez = scanner.nextLine();
        rez = rez.replaceAll("2", "5");
        System.out.println(rez);
    }
}
