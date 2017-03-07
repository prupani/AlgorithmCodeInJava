
public class StrngBuffer {

	public static String joinWords(String[] words){
		StringBuffer sentence = new StringBuffer();
		for(String s : words){
			sentence.append(s);
		}
		return sentence.toString();
		
	}

	public  static void main(String[] args){
		String[] words = {"an", "pri", "swa"};
		String s = joinWords(words);
		System.out.println(s);
		
	}
}

