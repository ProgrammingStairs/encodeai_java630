package myPackage;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
	public static void main(String args[]) {
//		Map<Integer,String> map = new HashMap<Integer, String>();
//		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		Map<Integer,String> map = new TreeMap<Integer, String>();

		map.put(111, "Andrew Anderson");
		map.put(102, "Peter Parker");
		map.put(143, null);
		map.put(104, "Mathew Math");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println("Key : "+m.getKey()+" value : "+m.getValue());					
		}		
	}
}

