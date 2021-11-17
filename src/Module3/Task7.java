package Module3;

public class Task7 {
    public static void main(String[] args) {
        String[] words = {"каждый", "охотник", "желает", "знать"};
        for (String s:words) {
            System.out.print(s + " ");
        }
        System.out.println("");
        int n = words.length;
        String temp;


        for (int i = 0; i < (n/2); i++) {
            temp = words[n-i-1];
            words[n-i-1] = words[i];
            words[i] = temp;
        }
        for (String s:words) {
            System.out.print(s + " ");
        }
    }
}
