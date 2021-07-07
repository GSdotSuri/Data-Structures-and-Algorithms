import java.util.*;


public class Q2SimpleInterest {

    public static float getSimpleInterest(float amount, float time, float rate) {
        rate  = rate/100;
        float simple_interest = amount*(1+rate*time);
        return simple_interest;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float p,r,t;
        System.out.println("Enter the principle amount");
        p = scn.nextFloat();
        System.out.println("Enter the rate of interest");
        r = scn.nextFloat();
        System.out.println("Enter the Time Period of the Loan");
        t = scn.nextFloat();

        System.out.println(getSimpleInterest(p,r,t));

    }
    
}
