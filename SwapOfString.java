package basic;

public class SwapOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "one";
		String s2 = "two";
		System.out.println("Before Swapping.....");
		System.out.println("S1=" + s1);
		System.out.println("S2=" + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping.....");
		System.out.println("S1=" + s1);
		System.out.println("S2=" + s2);
	}
}
