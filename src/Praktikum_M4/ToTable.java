package Praktikum_M4;

import java.util.Arrays;

public class ToTable {

    private int[] data;
    private int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int [][] resize() {
        int position = 0;
        int arr1[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = data[position];
                position++;
            }
        }return arr1;
    }

    public static void main(String[] args) {
        ToTable a = new ToTable(new int[]{1, 2, 3, 4, 5, 6,}, 3, 2);
        int[][] array = a.resize();
        System.out.println(Arrays.deepToString(array));
    }
}
