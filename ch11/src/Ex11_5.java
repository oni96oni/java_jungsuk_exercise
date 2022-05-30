import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator(); // 단, Iterator는 1회용이어서, 한번 다 읽고 다시 읽으려면 새로 호출해야한다. 

		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator it1 = list.iterator();

		while(it1.hasNext()) {
			Object obj = it1.next();
			System.out.println(obj);
		}
		
		HashSet hs = new HashSet();
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		hs.add("5");
		
		Iterator it2 = hs.iterator();

		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		HashMap hm = new HashMap();
		hm.put(1, "1");
		hm.put(2, "2");
		hm.put(3, "3");
		hm.put(4, "4");
		hm.put(5, "5");
		
		Iterator it3 = hm.keySet().iterator();

		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	} // main
}