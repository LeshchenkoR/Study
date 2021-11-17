package Module3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите адрес e-mail: ");
        String mail = scanner.nextLine();
        System.out.println(pochtoviYashik(mail));
    }

    public static String pochtoviYashik(String a) {
        int indexSobaka = a.indexOf('@');
        String pochtoviYashik = a.substring(indexSobaka + 1);
        return pochtoviYashik;

    }
}
