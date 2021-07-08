import java.util.*;

public class Q7hDiamondCutoutFromRectangleStarPattern {

    public static void patternWithWhile(int n){
        int id = 1, nst1 = n, nst2 = n, nsp = 1;
        
        while(id<=((2*n)-1)){

            if (id==1 || id ==((2*n)-1)){
                int cst = 1;
                while(cst<=2*n-1){
                    System.out.print("*");
                    cst++;
                }
                System.out.println();
            }
            else{
                int cst1 = 1;
                while(cst1<nst1){
                    System.out.print("*");
                    cst1 ++;
                }

                int csp = 1;
                while(csp<=nsp){
                    System.out.print(" ");
                    csp++;
                }

                int cst2 = 1;
                while(cst2<nst2){
                    System.out.print("*");
                    cst2 ++;
                }

                System.out.println();
                if(id<n){
                    nst1 = nst1-1;
                    nsp = nsp+2;
                    nst2 = nst2-1;
                }
                else{
                    nst1 = nst1+1;
                    nsp = nsp-2;
                    nst2 = nst2+1;
                }
                
            }
        
            id=id+1;

        }
    }

    public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    patternWithWhile(n);
    }
    
}