import java.util.*;

public class Q12SortOddEvenOrderNotMaintained {
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortArray(int arr[]) {
        int temp, low = 0, high = arr.length - 1;
        while (high >= low) {
            if (arr[low] % 2 != 0) {
                if (arr[high] % 2 == 0) {
                    temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                } else {
                    high--;
                }
            } else {
                low++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to store in the array: ");
        int noe = sc.nextInt();
        int[] arr = new int[noe];
        for (int arr_index = 0; arr_index < noe; arr_index++) {
            System.out.println(String.format("Enter the %d th value in the array", arr_index + 1));
            arr[arr_index] = sc.nextInt();
        }
        System.out.println("Original Array");
        displayArray(arr);
        System.out.println();
        System.out.println("Sorted Array");
        displayArray(sortArray(arr));
    }
}
