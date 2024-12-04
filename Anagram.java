package basic;

import java.util.Arrays;
public class Anagram {
public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
        if (s1.length() == s2.length()) {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b = Arrays.equals(c1, c2);
			if (b) {
				System.out.println("It is Anagram");
			} else {
				System.out.println(" It is not Anagram");
			}
		} else {
			System.out.println("strings are not anagram");
		}
	}

}
