package makingArrayList;

import java.util.HashMap;
import java.util.Map.Entry;


public class UseHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "USA");
		hashMap.put(2, "UK");
		hashMap.put(3, "Australia");
		hashMap.put(4, "Italy");
		
		//System.out.println("Country Rank:  "+ hashMap.getOrDefault( 2, "UK"));
		
		//System.out.println(hashMap.get(" "));
		
		//for(Entry<Integer, String> map:hashMap.entrySet()) {
			//System.out.println(map.getKey() + "  -->  "+ map.getValue());
		//}
		
		for(Entry<Integer, String> map:hashMap.entrySet()) {
			if(map.getValue().contains("a".toUpperCase()))
			System.out.println(map.getKey() + "  -->  "+ map.getValue());
		}
		
		//System.out.println(hashMap.entrySet());
	}

}
