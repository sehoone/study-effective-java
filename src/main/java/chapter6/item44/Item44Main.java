package chapter6.item44;

import java.util.HashMap;
import java.util.Map;

public class Item44Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 표준 함수형 인터페이스를 사용해라
		 * 
		 * 자바가 람다를 지원하면서 템플릿 메서드 패턴의 매력은 크게 줄었다. 
		 * 요즘은 함수 객체를 받는 정적 팩터리나 생성자를 제공하는 방법으로 템플릿 메서드 패턴을 대체하여 구현하고 있다. 즉, 함수 객체를 매개변수로 받는 생성자와 메서드를 더 많이 만들어야한다
		 * 
		 * https://sas-study.tistory.com/106
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
