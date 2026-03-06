package myPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(111, "Andrew Anderson");
		map.put(102, "Peter Parker");
		
		Map<Integer,Map<Integer, String>> newMap = new HashMap<Integer, Map<Integer,String>>();
		newMap.put(1000, map);
		
		for(Map.Entry m : newMap.entrySet()) {
			System.out.println("Key : "+m.getKey()+" value : "+m.getValue());	
			
			Object obj = m.getValue();
			Map<Integer,String> innerMap = (Map<Integer,String>)obj;
			
//			for(Map.Entry m1 : innerMap.entrySet()) {
//				System.out.println("\n\tKey : "+m1.getKey()+" value : "+m1.getValue());	
//			}		
			for(Integer i : innerMap.keySet()) {
				System.out.println(i);
			}
		}		
	}
}

