import java.util.*;

public class Q4firstOddJumpsEvenNos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of even numbers you want");
        int n = scn.nextInt();
        int latest_even = 2, latest_odd = 1;
        while(n!=0){
            System.out.print(latest_even + " ");
            n = n-1;
            latest_even = latest_even + 2*(latest_odd+1);
            latest_odd = latest_odd+2;


        }
    }
    
}
