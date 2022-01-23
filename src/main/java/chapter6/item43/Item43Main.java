package chapter6.item43;

import java.util.HashMap;
import java.util.Map;

public class Item43Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 람다보다는 메서드 참조를 사용해라
		 * 
		 * 람다로 기존 방식을 모두 대체해도 된다고 생각할 수 있다. 하지만 람다는 메서드,클래스와는 달리 이름이 없고 문서화도 못한다. 
		 * 그러므로 코드 자체로 동작이 명확하게 설명되지 않거나 코드 줄 수 가 많아지면 람다를 쓰지 말아야한다.
		 * 
		 */
        Map<String, Integer> frequencyTable = new HashMap<>();
        
        String[] a = {"1","3","5","7","5"};
        
        for (String s : a)
            frequencyTable.merge(s, 1, (count, incr) -> count + incr); // Lambda
        System.out.println(frequencyTable);

        frequencyTable.clear();
        String[] b = {"2","4","5","7","5","2","2"};
        for (String s : b)
            frequencyTable.merge(s, 1, Integer::sum); // Method reference
        System.out.println(frequencyTable);
	}
	
}
