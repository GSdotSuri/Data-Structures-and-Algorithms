import java.util.*;

public class Q08CountMultipleOf5 {

    public static int countMultiples(int arr[]) {
        int i, count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                count += 1;
            }
        }
        return count;
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
        int countofmultiples = countMultiples(arr);
        System.out.println(countofmultiples);
    }

}