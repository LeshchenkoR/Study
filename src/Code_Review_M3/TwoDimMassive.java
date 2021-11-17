package Code_Review_M3;

public class TwoDimMassive {
    public static void main(String[] args) {
        int temp;
        int step = 2;
        int n = 2;
        int m = 3;
        // int array[][] = new int[n][m];
        int[][] array={{1,2,3},{3,2,1}};
//заполнить массив

        for (int i = 0; i < step; i++) {
            for (int j = 0; j < 3; j++) {
                temp = array[j][0];
                for (int k = 0; k < m - 1; k++) {
                    array[j][k] = array[j][k + 1];
                    array[j][m - 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}

