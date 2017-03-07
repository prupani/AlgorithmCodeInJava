
public class replaceSpaceinString {

	public static char[] replaceSpaces(char[] array, int length){
		int spacecount=0;
		for(int i=0; i<length;i++){
			if(array[i]==' '){
				spacecount++;
			}
		}
		int newlength = length + spacecount*2;
		array[newlength]='\0';//ask aniket
		//char[] array=new char[newlength];
		
		for(int i=length-1;i>=0;i++){
			if(array[i]==' '){
				array[newlength-1]='0';
				array[newlength-2]='2';
				array[newlength-3]='%';
				newlength=newlength-3;
			}
			else{
				array[newlength-1]=array[i];
				newlength--;
			}
		}
		return array;
		
	}
	public static void main(String[] args) {
		char[] array = {'a','b','c','d',' ','e','f','g',' ','h',' ','j'};
	    replaceSpaces(array, array.length);

	}

}
