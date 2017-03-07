import org.apache.commons.lang3.StringUtils;
public class NullEmpty extends WrapperClass{

	public NullEmpty(){
		//super();
		//this(10);
		//super();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "";
		String b =null;
		
		//System.out.println(a.length());
		//System.out.println(b.length());//cannot do this as you cannot call any functions with null
		
		//System.out.println(b.length());
		
		StringUtils s = new StringUtils();
		
		String s1="abc";
		System.out.println(StringUtils.length((CharSequence) s));
		
		
		String str = null;
		//if(str.equals("Test")){
			//System.out.println("hey..");}
			
			if("Test".equals(str)){
				System.out.println("heyaaaa....");
			}
			if(s1.equals(s)){
				System.out.println("hello");
			}
			//WrapperClass wc = new WrapperClass();
		}

	//@Override
	//public void metLife() {
		// TODO Auto-generated method stub
		
	//}
	}


