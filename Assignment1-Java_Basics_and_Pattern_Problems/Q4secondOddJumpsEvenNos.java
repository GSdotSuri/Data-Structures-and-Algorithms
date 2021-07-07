import java.util.*;

public class Q4secondOddJumpsEvenNos {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of even numbers you want");
        int n = scn.nextInt();
        int i = 0, even = 2;
        while(i<n){
            even = even + 4*i;
            System.out.print(even + " ");
            i++;

        }
    }
    
}
