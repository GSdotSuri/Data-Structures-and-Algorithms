import java.util.*;

public class Q6ReverseNumber {
    public static int reverseNumber(int n){
        int ans = 0, temp = 0;
        while(n!=0){
            int last_digit = n%10;
            ans = ans*10 + last_digit;
            if((ans-last_digit)/10 != temp){
                System.out.println("Reversed number went out of the range of int");
                return 0;
            }
            n = n/10;
            temp = ans;
        }
        return ans;

        }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int reverse_number = reverseNumber(number);
        System.out.print(reverse_number);
        
    }
    
}
