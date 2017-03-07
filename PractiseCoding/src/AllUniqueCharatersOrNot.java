
public class AllUniqueCharatersOrNot {

	public  boolean stringUniqueCharacters(char[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					return false;
				}
			}
		}
		return true;
		
	}
	
	public boolean stringUniqueCharactersUsingCharaterSet(char[] array){
		boolean[] charset = new boolean[256];
		for(int i =0;i<array.length;i++){
			if(charset[array[i]]){
				return false;
			}
			charset[array[i]]=true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String test1="Aniket Hrow";
		char[] array = test1.toCharArray();
		AllUniqueCharatersOrNot test=new AllUniqueCharatersOrNot();
		Boolean flag = test.stringUniqueCharactersUsingCharaterSet(array);
		System.out.println(flag);

	}

}
