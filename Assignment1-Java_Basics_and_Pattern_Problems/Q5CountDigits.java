import java.util.*;

public class Q5CountDigits {
    public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int count_of_digits = countDigit(number);
        System.out.println(count_of_digits);
        
    }
}
