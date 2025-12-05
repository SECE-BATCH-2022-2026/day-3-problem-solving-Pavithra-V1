import java.util.Scanner;

public class StringOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String pattern=sc.nextLine();   
        int count=0;
        for(int i=0;i<=str.length()-pattern.length();i++){
            if(str.charAt(i)==pattern.charAt(0) && pattern.equals(str.substring(i, i+pattern.length()))){
                count++;
                i+=pattern.length()-1;
            }
        }
        System.out.println(count);
    }
}
