
// return pairs of all ints that add up to a given number
// [ 12,15,2,3,5,7,8,9,10] K = 15
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Sum {

	public static void main(String args[]) {

		Sum t = new Sum();
		int[] input = new int[] { 12, 15, 2, 3, 5, 7, 8, 9, 10 };
		
		Sum.test();
		Map<Integer, Integer> pairs = t.getPairs(input, 15);
		
		Set<Integer> s =pairs.keySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
             Map.Entry entry = (Entry) itr.next();
             entry.getKey();
             entry.getValue();
		}
		
		
		
		ArrayList<Integer> a = new ArrayList();
		a.add(1);
		a.add(2);
		
	    Iterator<Integer> it =	a.iterator();
	    
	    int data;
	    while(it.hasNext()){
	    	data = it.next();
	    }
		
		for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	/**
	 * This method accept an array as input and returns a map with pair of
	 * numbers which add to the specified sum.
	 */
	public Map<Integer, Integer> getPairs(int[] input, int sum) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		try {
			// validate the input
			if (input == null && input.length == 0) {
				throw new RuntimeException(" Invalid input ");
			}

			int n = input.length;
			int a = 0;

			// construct an arraylist from input
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				result.add(input[i]);
			}

			// check if pairs add to the sum
			for (int i = 0; i < n; i++) {
				a = Math.abs(sum - input[i]);
				if (result.contains(a)) {
					pairs.put(input[i], a);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pairs;
	}
	
	public static void test(){
		LinkedHashMap<String,Integer> test = new LinkedHashMap();
		test.put("Priya",1);
		test.put("Aniket",1);
		test.put("Swati",1);
		if(test.containsKey("Swati")){
			int value = test.get("Swati");
			value++;
			test.put("Swati", value);
		}
		
		Set s = test.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			String entry = (String) itr.next();
			System.out.print(" key " + entry);
			System.out.print(" value " + test.get(entry));
			System.out.println("");
			
			
					
		}
	}
	
	public void test1(){
		LinkedList<Integer> test1 = new LinkedList();
		test1.add(1);
		test1.add(2);
		
		Iterator<Integer> itr1 = test1.iterator();
		while(itr1.hasNext()){
			Integer i = itr1.next();
			
		}
	}
}
