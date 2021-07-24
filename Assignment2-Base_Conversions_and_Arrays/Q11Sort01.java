import java.util.*;

public class Q11Sort01 {
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortArray(int arr[]) {
        int i, count0 = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0 += 1;
            }
        }
        for (i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (i = count0; i < arr.length; i++) {
            arr[i] = 1;
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
        displayArray(sortArray(arr));
    }
}
