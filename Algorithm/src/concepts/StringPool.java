package concepts;

public class StringPool {

	public static void main(String[] args) {
		String a=new String("Akash");
		String s=a.intern();
		String t="Akash";
		System.out.println(a==s);
		System.out.println(s==t);
	}

}
