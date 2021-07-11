import java.util.*;

public class Q6Gcd {

    public static int getGcd(int num1, int num2) {
        int ans = 0;
        if (num1 == 0) {
            return num2;
        }

        else if (num2 == 0) {
            return num1;
        }

        else if (num1 == num2) {
            ans = num1;
        }

        else {
            for (int i = 1; i <= Math.min(num1, num2); i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    if (i > ans) {
                        ans = i;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int gcd = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();
        if (num1 < 0 || num2 < 0) {
            if (num1 < 0 && num2 < 0) {
                num1 = num1 * -1;
                num2 = num2 * -1;
                gcd = -1 * getGcd(num1, num2);
            } else if (num1 < 0) {
                num1 = num1 * -1;
                gcd = getGcd(num1, num2);
              } 
            else if (num2 < 0) {
                num2 = num2 * -1;
                gcd = -1*getGcd(num1, num2);
            }
        }
        else{
            gcd = getGcd(num1, num2);
        }

        System.out.print(gcd);
    }
}
