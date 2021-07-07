import java.util.*;

public class Q7ePascalTriangle {

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        int fact=1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int ncr(int n, int r){
        int ans;
        int numerator = 1;
        for(int iter=n-Math.max(r,n-r)+1;iter<=n;iter++){
            numerator = numerator*iter;
        }
        ans = numerator/factorial(Math.max(r,n-r));
        return ans;
    } 


    public static void patternWithWhile(int n){
        int id = 0, nst = 0;
        while(id<=n){
            int cst = 0;
            while(cst<=nst){
                System.out.print(ncr(nst,cst));
                cst ++;
            }
            System.out.println();
            nst++;
            id++;
        }

    }

    public static void patternWithFor(int n){
        int nst = 0;
        for(int id = 0;id<=n;id++){
            for(int cst = 0; cst<=nst; cst++){
                System.out.print(ncr(nst, cst));
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
        //patternWithFor(n);
        //System.out.println(factorial(2));
        //System.out.println(ncr(3,2));
    }
    
}
