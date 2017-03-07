

public class SubStringExample {

	public static void main(String args[]){
		
		new SubStringExample().test("abcd");
		}
	
	public void test(String test){
		
			String test1 = test.substring(0, 0);
			System.out.println(" Sub string (0,0) "+ test1);
			
			String test2 = test.substring(0, 1);
			System.out.println(" Sub string (0,1) "+ test2);
			
			String test3 = test.substring(1);
			System.out.println(" Sub string (0,1) "+ test3);
			
			String test4 = test.substring(3);
			System.out.println(" Sub string (test) "+ test4);
			
	}
}