package chapter11.item82;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Item82Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 스레드 안전성 수준을 문서화하라
		 * 
		 * Java API 문서에 synchronized 키워드가 보이는 메서드는 스레드에 안전하다고 말할 수 있습니다. 
		 * 하지만 몇 가지 측면에서는 이는 틀린 얘기일 수 있습니다. 스레드 안전성에도 어느 정도의 수준인지 나뉘므로 멀티 스레드 환경에서도 안전하게 사용하려면 지원하는 스레드 안전성 수준을 명시해야 합니다.
		 * 
		 * 불변(immutable): 해당 클래스의 인스턴스는 마치 상수와도 같아서 외부 동기화도 필요 없습니다. String, Long, BigInteger
		 * 무조건적인 스레드 안전(unconditionally thread-safe): 해당 클래스의 인스턴스는 수정될 수 있지만 내부에서도 충실히 동기화하여 별도의 외부 동기화없이 동시에 사용해도 안전합니다. AtomicLong, ConcurrentHashMap
		 * 조건부 스레드 안전(conditionally thread-safe): 무조건적인 스레드 안전성과 같지만 일부 메서드는 동시에 사용하려면 외부 동기화가 필요합니다. Collections.synchronized 래퍼 메서드가 반환한 컬렉션
		 * 스레드 안전하지 않음(not thread-safe): 해당 클래스의 인스턴스는 수정될 수 있으며 동시에 사용하려면 각각의 메서드 호출을 클라이언트가 선택한 외부 동기화 로직으로 감싸야 한다. ArrayList, HashMap
		 * 스레드 적대적(thread-hostile): 외부 동기화로 감싸더라도 멀티스레드 환경에서 안전하지 않습니다.
		 * 
		 * 모든클래스가 자신의 스레드 안정성 정보를 명확히 문서화 해야한다. 정확한 언어로 명확히 설명하거나 스레드 안전성 어노테이션을 사용한다.
		 */
		
		// synchronizedMap은 동시 작업 수행이 허용하지않음. 반복하는 동안  HashMap 을 업데이트하려고 하면 ConcurrentModificationException 이 발생 
//	    Map<Integer, String> map = new HashMap<>();
//	    map.put(1, "test1");
//	    map.put(2, "test2");
//	    Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
//	    Iterator<Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
//	    while (iterator.hasNext()) {
//	        synchronizedMap.put(3, "Modification");
//	        iterator.next();
//	    }
	    
	    Map<Integer, String> map2 = new ConcurrentHashMap<>();
	    map2.put(1, "test1");
	    map2.put(2, "test2");
	     
	    Iterator<Entry<Integer, String>> iterator2 = map2.entrySet().iterator();
	    while (iterator2.hasNext()) {
	    	map2.put(3, "Modification");
	    	iterator2.next();
	    }
	}
}
