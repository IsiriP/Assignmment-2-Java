package codesnippet;

import java.util.*;

public class RotateArray {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations (m): ");
        int m = sc.nextInt();
        m = m % n;

        //Reverse first m elements
        reverse(arr, 0, m - 1);
        //Reverse remaining elements
        reverse(arr, m, n - 1);
        //Reverse entire array
        reverse(arr, 0, n - 1);

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

