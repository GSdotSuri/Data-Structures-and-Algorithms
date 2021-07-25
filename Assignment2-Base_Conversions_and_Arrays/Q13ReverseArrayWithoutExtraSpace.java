import java.util.*;

public class Q13ReverseArrayWithoutExtraSpace {
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverseArray(int arr[]) {
        int temp, low = 0, high = arr.length - 1;
        while (high >= low) {
            temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to store in the array: ");
        int noe = sc.nextInt();
        int[] arr = new int[noe];
        for (int arr_index = 0; arr_index < noe; arr_index++) {
            System.out.println(String.format("Enter the %dth value in the array", arr_index + 1));
            arr[arr_index] = sc.nextInt();
        }
        displayArray(reverseArray(arr));
    }
}
