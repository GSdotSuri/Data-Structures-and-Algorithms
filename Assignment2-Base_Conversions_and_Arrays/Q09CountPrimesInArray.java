import java.util.*;

/**
 * Q9CountPrimesInArray
 */
public class Q09CountPrimesInArray {
    public static Boolean checkPrime(int n) {

        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static int counPrimes(int arr[]) {
        int i, count = 0;
        for (i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
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
        int countofprimes = counPrimes(arr);
        System.out.println(countofprimes);
    }
}