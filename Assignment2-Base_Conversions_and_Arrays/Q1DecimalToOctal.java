import java.util.*;

public class Q1DecimalToOctal {

    public static int decimalToOctalBase(int n) {
        int ans = 0;
        int power = 0;

        while (n != 0) {
            ans = (int) Math.pow(10, power) * (n % 8) + ans;
            power++;
            n = n / 8;
        }

        return ans;

    }

    public static void main(String[] args) {
        int n, base;
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        System.out.println(decimalToOctalBase(n));

    }
}