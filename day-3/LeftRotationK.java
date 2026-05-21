import java.util.Scanner;

public class LeftRotationK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter K value: ");
        int k = sc.nextInt();

        k = k % arr.length;

        for (int j = 0; j < k; j++) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        System.out.println("Array after left rotation:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}