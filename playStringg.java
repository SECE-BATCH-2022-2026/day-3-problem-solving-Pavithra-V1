import java.util.*;
class playStringg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] inp = new String[n];
        for(int i = 0; i < n; i++) {
            inp[i] = sc.nextLine();
        }
        int index = Integer.parseInt(sc.nextLine());
        System.out.println(UserMainCode.playString(inp, index));
        sc.close();
    }
}
class UserMainCode {
    public static String playString(String[] inp, int index) {
        String res = "";
        char c = '\0';
        for(String s : inp) {
            try {
                c = s.charAt(index - 1);
            } catch(Exception e) {
                c = '$';
            }
            res = res + c;
        }
        return res;
    }
}
