import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class StringAnagramOrStringPermutation {

	public static boolean stringAnagram(String first, String second){
		String first2= first;
	    if(!first.isEmpty() && !second.isEmpty() && first!=null && second!=null){
	    	if(first.length()!=second.length()){
	    		return false;
	    	}
;	    	for(int i =0;i<first.length();i++){
	    		if(second.contains(first.substring(i, i+1))){
	    			String removeNext = first.substring(i, i+1);
	    			first2 = first2.replace(removeNext, "");
	    		}
	    	}
	    	if(first2.isEmpty()){
	    		return true;
	    	}
	    }
	    
		return false;
	}
	public static void main(String[] args) {
		boolean test = stringAnagram("dirst","tdirs");
		System.out.println(test);

	}

}
