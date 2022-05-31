import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Ex11_18 {
	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		HashMap map = new HashMap();

		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) { // map데이터에 data[i]가 들어가 있냐? 있으면 true 없으면 false 반환.
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);  // 기존에 존재하는 키면 기존 값을 1증가
			} else {
				map.put(data[i], 1);	    // 긱존에 존재하지 않는 키는 값을 1로 저장		
			}
		}

		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
		}
	} // main

	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) //즉, bar[0]='#', bar[1]='#', ''' , bar[bar.length]='#' 이런식으로 배열이 생김
			bar[i] = ch; 

		return new String(bar); // String(char[] chArr), 배열을 매개변수로 String으로 이어버린다.
	}
}