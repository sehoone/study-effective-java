package chapter5.item26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Item26Main {

	public static void main(String[] args) {
		/**
		 * Raw 타입은 사용하지 말라. 
		 * raw타입을 쓰면 제네릭이 안겨주는 안전성과 표현력을 읽게된다.(컴파일 타임에 타입에러릉 인지못함)
		 */
		List rawList = new ArrayList(); // Raw type (로타입)
		List<String> strList = new ArrayList<>(); // parameterized type (매게변수화타입)
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(2);
		System.out.println(numElementsInCommon(s1, s2));
	}
	
	private static int numElementsInCommon(Set s1, Set s2) {
	// 비한정적 와일드카드 타입 사용. 타입이 안전하고 유연하다
	//private static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		//s1.add("asd");
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}
}
