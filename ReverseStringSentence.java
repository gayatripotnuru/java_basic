package basic;

public class ReverseStringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "welcome to java";
		String[] words = sentence.split(" ");
		StringBuilder reverseSentence = new StringBuilder();
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			reverseSentence.append(reversedWord.reverse().toString()).append(" ");
		}
 System.out.println(reverseSentence.toString().trim());
	}
}
