package myPackage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Andrew Anderson");
		map.put(102, "Peter Parker");
		map.put(103, "Jack Jackson");
		map.put(104, "Mathew Math");
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>)itr.next();
			System.out.println("Key : "+m.getKey()+" value : "+m.getValue());		
		}
	}
}

