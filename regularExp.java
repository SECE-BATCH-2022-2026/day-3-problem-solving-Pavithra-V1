import java.util.*;        
class regularExp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(UserMainCode.regularExpression(inp));
    }
}

class UserMainCode {
    public static boolean regularExpression(String inp) {
        java.util.regex.Pattern p =java.util.regex.Pattern.compile("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
        java.util.regex.Matcher m = p.matcher(inp);
        return m.matches();
    }
}
