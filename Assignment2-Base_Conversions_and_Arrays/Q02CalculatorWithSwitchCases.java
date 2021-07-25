import java.util.*;

public class Q02CalculatorWithSwitchCases {

    public static double calculateOperation(double a, double b, String ch) {
        double ans = 0;
        switch (ch) {
            case "+":
                ans = a + b;
                break;

            case "-":
                ans = a - b;
                break;

            case "*":
                ans = a * b;
                break;

            case "%":
                ans = a % b;
                break;

            case "/":
                if (b == 0) {
                    ans = 0;
                    System.out.println("A number cannot be divided by 0");
                } else {
                    ans = a / b;
                }
                break;

            default:
                System.out.println("Invalid Operation");
        }

        return ans;

    }

    public static void main(String[] args) {
        double a, b;
        String operation;
        System.out.println("Enter first number");
        Scanner scn = new Scanner(System.in);
        a = scn.nextDouble();
        System.out.println("Enter second number");
        b = scn.nextDouble();
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Enter the operation character");
        operation = scn2.nextLine();
        System.out.println(calculateOperation(a, b, operation));

    }

}
