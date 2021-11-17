package Praktikum_M4;

import java.util.Arrays;

public class ToLine {
    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j <data[0].length ; j++) {
                count++;
            }
        }
        int[] arr1 = new int[count];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j <data[0].length ; j++) {
                arr1[k] = data[i][j];
                k++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {

        ToLine b = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] array = b.resize();
        System.out.println(Arrays.toString(array));
    }
}
