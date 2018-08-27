package makingArrayList;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		
		list.add("East");
		list.add("West");
		list.add("North");
		list.add("South");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.size();
		System.out.println(list.size());
		
		for (String st : list) {
			System.out.println(st);
	}

}
}