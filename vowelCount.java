import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(UserMainCode.countVowels(str));
    }
}

class UserMainCode {
    public static int countVowels(String inp) {
        Matcher m = Pattern.compile("[aeiouAEIOU]").matcher(inp);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }
}
