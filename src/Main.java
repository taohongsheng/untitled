import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(numbers, numbers.length);

        // 数组排序
        Arrays.sort(numbers);

        // 数组查找
        int index = Arrays.binarySearch(numbers, 3);

        // 数组比较
        boolean equal = Arrays.equals(numbers, copy);

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("copy: " + Arrays.toString(copy));
        System.out.println("index of 3: " + index);
        System.out.println("numbers and copy are equal: " + equal);

        // 二维数组
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}