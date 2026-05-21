package day3.Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        // Read array size safely
        while (true) {
            try {
                System.out.print("Enter array size: ");
                n = sc.nextInt();

                if (n < 2) {
                    System.out.println("Array size must be at least 2.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                sc.next(); // clear invalid input
            }
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        // Read array elements safely
        for (int i = 0; i < n; i++) {

            while (true) {
                try {
                    arr[i] = sc.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Enter integers only.");
                    sc.next(); // clear invalid input
                }
            }
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Number = " + secondLargest);
        }

        sc.close();
    }
}