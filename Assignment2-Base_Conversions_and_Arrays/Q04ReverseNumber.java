import java.util.*;

public class Q04ReverseNumber {

    public static int reverseDigits(int n) {
        int ans = 0, temp = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            System.out.println(ans + "    " + temp);
            if (temp != (ans - (n % 10)) / 10) {
                System.out.println("Reversed number went out of the range of int");
                return 0;
            }
            temp = ans;
            n = n / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int reverse_number = reverseDigits(number);
        System.out.print(reverse_number);

    }

}
