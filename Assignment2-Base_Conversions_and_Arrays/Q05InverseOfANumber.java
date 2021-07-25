import java.util.*;

public class Q05InverseOfANumber {
    public static int hasDuplicates(int n) {
        int count_arr[] = new int[10];
        int count = 0, last_digit = 0;
        while (n != 0) {
            last_digit = n % 10;
            count_arr[last_digit]++;
            if (count_arr[last_digit] > 1) {
                return 1;
            }
            n = n / 10;
        }
        return 0;
    }

    public static int countDigits(int n) {
        int temp = n, ndigits = 0;
        while (temp != 0) {
            temp = temp / 10;
            ndigits++;
        }
        return ndigits;

    }

    public static int validate(int n) {
        int temp = n, last_digit;
        int ndigits = countDigits(n);
        while (temp != 0) {
            last_digit = temp % 10;
            temp = temp / 10;
            if (last_digit < 1 || last_digit > ndigits) {
                System.out.println(
                        "The digit " + last_digit + " in the entered number doesen't lie in the range 1 to " + ndigits);
                return 0;
            } else {
                continue;
            }
        }
        if (hasDuplicates(n) == 1) {
            System.out.println("The number" + n + "has duplicate characters");
            return 0;
        }
        return 1;
    }

    public static int reverseNumber(int n) {
        if (validate(n) == 1) {
            System.out.println(1);
            int power = 0, ans = 0, last_digit, ndigits = countDigits(n);
            int temp = ndigits;
            while (n != 0) {
                last_digit = n % 10;
                ans = ans + (int) Math.pow(10, ndigits - last_digit) * temp;
                System.out.println(last_digit + " " + ans);
                n = n / 10;
                temp--;
            }
            return ans;
        } else {
            System.out.println(0);
            System.out.println("Input is not validated");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int n = scn.nextInt();
        // System.out.println(validate(n));
        // System.out.println(hasDuplicates(n));
        System.out.println(reverseNumber(n));
    }

}
