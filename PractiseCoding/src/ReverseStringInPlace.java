
public class ReverseStringInPlace {

	public void reverseStringInPlace(String s){
		int i=0; int j=s.length()-1; char temp='\0';
		char[] test = s.toCharArray();
		while(i<=j){
//			test=s.charAt(i);
//			s.charAt(i)=s.charAt(j); 
//			s.charAt(j)=test;
			temp=test[i];
			test[i]=test[j];
			test[j]=temp;
			i++;
			j--;
		}
		System.out.println(test);
	}
	public static void main(String[] args) {
		String test1="Priyanka Rupani";
		System.out.println(test1);
		ReverseStringInPlace rs = new ReverseStringInPlace();
		rs.reverseStringInPlace(test1);
	}

}
