import java.util.*;

/**
 * Q7iHourGlassOutOfSquareNumberPattern
 */
public class Q7iHourGlassOutOfSquareNumberPattern {

    public static void patternWithWhile(int n) {
        int id = 1, nst = 1, nsp = 2 * (n - 1) - 1;

        while (id <= 2 * n - 1) {
            int temp = n;

            if (id == n) {
                int cst = 1;
                while (cst <= (2 * n) - 1) {
                    System.out.print(temp + "  ");
                    if (cst >= n) {
                        temp++;
                    }

                    else {
                        temp--;
                    }
                    cst++;
                }

            }

            else {
                int cst = 1;

                while (cst <= nst) {
                    System.out.print(temp + "  ");
                    cst++;
                    temp--;
                }
                temp++;

                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(temp + "  ");
                    csp = csp + 1;
                }

                cst = 1;

                while (cst <= nst) {
                    System.out.print(temp + "  ");
                    cst++;
                    temp++;
                }

            }

            System.out.println();
            if (id < n) {
                nst = nst + 1;
                nsp = nsp - 2;
            } else {
                nst = nst - 1;
                nsp = nsp + 2;
            }

            id++;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        patternWithWhile(n);
    }

}
