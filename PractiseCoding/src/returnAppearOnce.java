import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class returnAppearOnce {

	/**
	 * method to return first element which appeared only once in the array.
	 * @param input
	 * @return
	 */
	public static int test1(String[] input) {
		try {
			boolean found = false;
			LinkedHashMap<String, Integer> store = new LinkedHashMap<String, Integer>();
			int count = 1;
			for (int i = 0; i < input.length; i++) {
				if (store.containsKey(input[i])) {
					int value = (int) store.get(input[i]);
					value++;
					store.put(input[i], value);
				} else
					store.put(input[i], (int) count);
			}
			Set<String> s = store.keySet();
			Iterator<String> itr = s.iterator();

			// print the LinkedHashMap contents.
			// while(itr.hasNext()){
			// String entry = (String) itr.next();
			// System.out.print(" key " + entry);
			// System.out.print(" value " + store.get(entry));
			// System.out.println("");
			// }
			while (itr.hasNext()) {
				String entry = (String) itr.next();
				if (store.get(entry) == 1) {
					System.out.println(" key " + entry);
					System.out.println(" value " + store.get(entry));
					found = true;
					break;
				}
				// return -1;
			}
			if(!found)
			return -1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public static void main(String args[]) {
		String[] input = { "Aniket", "Priya","Priya", "Aniket" };
		int result = returnAppearOnce.test1(input);
		System.out.println(result);

	}

}