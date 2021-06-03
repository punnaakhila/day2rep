package day7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
public class Reader {
	public static void main(String[] args) {
	String s;
	try {
		FileReader f=new FileReader("D:/myfile/mine.txt");
		BufferedReader b=new BufferedReader(f);
		LineNumberReader l=new LineNumberReader(b);
		while((s=l.readLine())!=null)
			System.out.println(l.getLineNumber()+"."+s);
		l.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
