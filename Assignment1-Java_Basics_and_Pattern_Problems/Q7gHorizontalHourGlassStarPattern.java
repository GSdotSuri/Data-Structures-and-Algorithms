import java.util.*;

public class Q7gHorizontalHourGlassStarPattern {

    public static void patternWithWhile(int n){
        int id = 1, nst1 = 1, nst2 = 1, nsp = 2*(n-1);
        while(id<=2*n-1){

            int cst1 = 1;
            
            while(cst1<=nst1){
                System.out.print("*");
               cst1 ++;
            }

            int csp = 1;
            while(csp<=nsp){
                System.out.print(" ");
                csp = csp+1;
            }

            int cst2 = 1;
            
            while(cst2<=nst2){
                System.out.print("*");
               cst2 ++;
            }
            
            System.out.println();
            if(id<n){
                nst1 = nst1+1;
                nsp = nsp-2;
                nst2 = nst2+1;
            }
            else{
                nst1 = nst1-1;
                nsp = nsp+2;
                nst2 = nst2-1;
            }
            
            id++;
        }

    }

    public static void patternWithFor(int n){
        int nst = 1, nsp = n-1;
        for(int id = 1;id<=2*n-1;id++){

            for(int csp = 1;csp <= nsp;csp++){
                System.out.print(" ");
            }

            for(int cst = 1; cst<=nst;cst++){
                 System.out.print("*");
            }
            System.out.println();
            if(id<n){
                nst = nst+2;
                nsp = nsp - 1;
            }
            else{
                nst = nst-2;
                nsp = nsp+1;
            }

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
    }
    
}
