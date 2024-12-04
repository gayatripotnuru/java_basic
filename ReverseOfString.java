package basic;

public class ReverseOfString {

	public static void main(String[] args) {
		String s = "gayatri";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of string: " + rev);

	}

}
