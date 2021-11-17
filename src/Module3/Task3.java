package Module3;

public class Task3 {
    public static void main(String[] args) {
        String[] names = {"Sasha", "Igor", "Misha", "Kolya", "Vova"};
        String[] result = new String[5];
        int[] sumPoint = new int[5];
        int point[][] = {
                {4, 2, 6, 7, 1},
                {6, 3, 4, 8, 4},
                {5, 9, 4, 3, 4},
                {5, 5, 6, 7, 2},
                {8, 3, 5, 4, 2}
        };
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < point.length; j++) {
                sumPoint[i] += point[i][j];
            }
            result[i] = names[i] + " - " + sumPoint[i] + " points";
            System.out.println(result[i]);
        }
    }
}
