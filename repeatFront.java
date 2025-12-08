import java.util.Scanner;
public class repeatFront {
    public static String usermaincode(String str, int n) {
        if (str == null || str.isEmpty() || n <= 0) {
            return str; 
        }
        String prefix = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < n; i++) {
            sb.insert(0, prefix);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();
        String result = usermaincode(input, n);
        System.out.println(result);
        sc.close();
    }
}
