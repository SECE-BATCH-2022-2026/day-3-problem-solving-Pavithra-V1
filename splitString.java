import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c=sc.nextLine().charAt(0);
		String[] s=UserMainCode.split(str,c);
		for(String i:s){
			System.out.println(i);
		}
	}
}
class UserMainCode {
    public static String[] split(String inp,char c) {
        String[] sarr=inp.split(""+c);
        int i=0;
        for(String j:sarr){
        	sarr[i++]=new StringBuilder(j).reverse().toString().toLowerCase();
        }
        return sarr;
    }
}