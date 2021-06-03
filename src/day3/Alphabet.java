package day3;


	
import java.util.Scanner;
public class Alphabet{
	static boolean isVowel(char ch) {
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
			return false;
		}
		return true;
	}
	public static String alterstring(char[] s) {
	for(int i=0;i<s.length;i++) {
		if(!isVowel(s[i])) {
			if(s[i]=='z') {
				s[i]='b';
			}
			else {
				s[i]=(char)(s[i]+1);
				if(isVowel(s[i])) {
					s[i]=(char)(s[i]+1);
				}
			}
		}
	}
	return String.valueOf(s);
}
public static void main(String[] args) {
	System.out.println("enter string");
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	System.out.println(alterstring(str.toCharArray()));
	}
}


