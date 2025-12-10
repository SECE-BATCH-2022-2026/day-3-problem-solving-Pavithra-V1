import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(UserMainCode.checkPhone(inp));
    }
}

class UserMainCode {
    public static boolean checkPhone(String inp) {
        Pattern p = Pattern.compile("^[1-9]{2}[0-9]{8}$");
        Matcher m = p.matcher(inp);
        return m.matches();
    }
}
