import java.util.*;

public class Q07Lcm {
    public static int lcmTwoNoscm(int a, int b) {
        int i, ans;
        int max_num = Math.max(a, b);
        for (i = max_num;;) {
            if (i % a == 0 && i % b == 0) {
                ans = i;
                break;
            }
            i += max_num;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();
        System.out.println((lcmTwoNoscm(num1, num2)));
    }
}
