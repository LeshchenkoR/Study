package Module3;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        //вывод в обратном порядке
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println("");
        int temp = 0;
        //Сортировка по убыванию
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.print(nums[i] + "  ");
        }
    }

}
