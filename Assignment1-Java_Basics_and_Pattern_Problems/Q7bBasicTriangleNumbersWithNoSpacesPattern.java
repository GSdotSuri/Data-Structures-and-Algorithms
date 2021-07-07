import java.util.*;

public class Q7bBasicTriangleNumbersWithNoSpacesPattern {

    public static void patternWithWhile(int n){
        int id = 1, nst = 1;
        while(id<=n){
            int cst = 1;
            while(cst<=nst){
                System.out.print(cst);
                cst ++;
            }
            System.out.println();
            nst++;
            id++;
        }

    }

    public static void patternWithFor(int n){
        int nst = 1;
        for(int id = 1;id<=n;id++){
            for(int cst = 1; cst<=nst; cst++){
                System.out.print(cst);
            }
            System.out.println();
            nst++;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        patternWithWhile(n);
        System.out.println();
        System.out.println();
        patternWithFor(n);
    }
    
}
