package day5;
interface Message{
	String myMsg();
}
public class Anonymous {
	public static void main(String[] args) {
		Anonymous acc= new Anonymous();
		//String s = acc.msg("World").display();{
		//System.out.println("string "+s);
		Message msg = new Message(){
			@Override
			public String myMsg() {
				return "Hello World";
			}
		};
		System.out.println(msg.myMsg());
	}
}
