package Code_Review_M3;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1};
        int[] b = new int[a.length];
        int n = 9;
        for (int i = a.length - 1; i >= 0; i--) {
            if (i + n >= a.length) {
                b[i + n - a.length] = a[i];
            } else {
                b[i + n] = a[i];
            }
        }
        for (int item:b){
                  System.out.print(item);
        }

    }
}
