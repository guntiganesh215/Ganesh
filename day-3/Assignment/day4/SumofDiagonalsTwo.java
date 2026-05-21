package Assignment.day4;

public class SumofDiagonalsTwo {

    public static int solution(int[][] arr) {
        int size = arr.length;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            // Main diagonal
            sum = sum + arr[i][i];

            // Secondary diagonal
            sum = sum + arr[i][size - 1 - i];
        }

        // Subtract center element if matrix size is odd
        if (size % 2 == 1) {
            sum = sum - arr[size / 2][size / 2];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(solution(arr));
    }
}