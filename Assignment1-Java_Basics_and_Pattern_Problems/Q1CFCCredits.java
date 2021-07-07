import java.util.*;


public class Q1CFCCredits {

    public static String getBadge(int credit) {
        if(credit<4500){
            return "Rising Star";
        }
        else if(credit>=4500 || credit<6000){
            return "Mega Leader";
        }
        else if(credit>=6000 || credit<7500){
            return "Giga Leader";
        }
        else{
            return "Tera Leader";
        }
  
    }

    public static void main(String[] args) {
        System.out.println("Enter total credits earned by you");
        Scanner scn = new Scanner(System.in);
        int credit = scn.nextInt();
        System.out.println(getBadge(credit));

    }
    
}
