import java.util.*;

public class Q10CheckSorted {
    public static void checkSorted(int arr[]) {
        int i;
        boolean issorted = true;
        if (arr.length <= 1) {
            issorted = true;
        } else {
            for (i = 1; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    issorted = false;
                    break;
                }
            }
        }
        if (issorted) {
            System.out.println("The givven array is sorted");
        } else {
            System.out.println("The giiven array is not sorted");
        }
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
        checkSorted(arr);
    }
}
