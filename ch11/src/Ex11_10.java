import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num));
			set.add(num);
		}
		
		System.out.println(set);
		List list = new LinkedList(set); // LinkedList(Collection c)
		
		Collections.sort(list);          // Collections.sort(List list) - 오름차순
		System.out.println(list);
		
		Collections.sort(list, new descending());  // Collections.sort(List list, Comparator c) - 내림차순         
		System.out.println(list);
	}
	
	
}

class descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparator && o2 instanceof Comparable) {
			return 0;
		}
		
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		
		return c1.compareTo(c2) * -1;
	}
}
