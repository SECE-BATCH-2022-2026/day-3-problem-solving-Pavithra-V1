import java.util.*;
import java.util.regex.*;

class regex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        if (UserMainCode.checkAge(inp)) {
            System.out.println("Valid age");
        } else {
            System.out.println("Invalid age");
        }
    }
}

class UserMainCode {
    public static boolean checkAge(String inp) {
        Pattern p = Pattern.compile("^(2[0-9]|3[0-9]|4[0-5])$");
        Matcher m = p.matcher(inp);
        return m.matches();
    }
}
