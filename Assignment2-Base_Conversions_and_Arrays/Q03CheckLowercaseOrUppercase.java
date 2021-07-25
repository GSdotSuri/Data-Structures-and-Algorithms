import java.util.*;

public class Q03CheckLowercaseOrUppercase {

    public static String checkCase(char ch) {
        String case_type;

        if (ch >= 'A' && ch <= 'Z') {
            case_type = "Uppercase";
        } else if (ch >= 'a' && ch <= 'z') {
            case_type = "Lowercase";
        } else {
            case_type = "Invalid Input";
        }

        return case_type;

    }

    public static void main(String[] args) {
        char ch;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a character");
        ch = scn.next().charAt(0);
        System.out.println(checkCase(ch));

    }

}
