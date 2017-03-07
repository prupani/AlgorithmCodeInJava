
public class StringCompression {

	//ONE WAY OF DOING THIS. BUT THIS IS O(N2) TIME not efficient.
	public static String stringComprssionFn(String str){
		int count =1;
		String test = "";
		char[] array=str.toCharArray();
		int length=str.length();
		char last = str.charAt(0);
		for(int i=1;i<length;i++){
			if(array[i]==last)
			{
				count++;
			}
			else{
				test+=last;
				test+=count;
				last=str.charAt(i);
				count=1;
			}
			}
		
		return test+last+count;
	}
	
	
	
	
	//another way using the stringbuffer method.
	public static String StringBufferWayStringCompression(String str){
		int size = compressedStringSize(str);
		if(size>str.length()){
			return str;
		}
		char last; int count=1; StringBuffer mystr = new StringBuffer();
		last = str.charAt(0);
		int length = str.length();
		for(int i=1;i<str.length();i++){
			if (last==str.charAt(i)){
				count++;
			}
			else{
				mystr.append(last);
				mystr.append(count);
				last=str.charAt(i);
				count=1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
		
	}
	
	public static int compressedStringSize(String str){
		
		if(str==null || str.isEmpty()) return 0;
		int count =1; int size=0;
		char last = str.charAt(0);
		int length = str.length();
		System.out.println("Size of  string is  "+ length);
		for(int i=1;i<str.length();i++){
			if (last==str.charAt(i)){
				count++;
			}
			else{
				last=str.charAt(i);
				size+=1+String.valueOf(count).length();
				count=1;
			}
		}
		size+=1+String.valueOf(count).length();
		System.out.println("Size of compressed string is  "+ size);
		return size;
	}
	
	public static void main(String[] args) {
	String str="aaaaaaaaaaaaaaaaaaaaaaaaabcde";
	String test = StringBufferWayStringCompression(str);
	System.out.println(test);
	}

}
