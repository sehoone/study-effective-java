package chapter6.item42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item42Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 익명 클래스보다는 람다를 사용해라
		 * 
		 * 람다로 기존 방식을 모두 대체해도 된다고 생각할 수 있다. 하지만 람다는 메서드,클래스와는 달리 이름이 없고 문서화도 못한다. 
		 * 그러므로 코드 자체로 동작이 명확하게 설명되지 않거나 코드 줄 수 가 많아지면 람다를 쓰지 말아야한다.
		 * 
		 */
	    List<String> strings = new ArrayList<>();
	    strings.add("aa");
	    strings.add("sss");
	    strings.add("f");
	    strings.add("sddd");
	    strings.add("eqwee");
	    strings.add("as");

	    // before sorting
	    for (String str : strings) {
	        System.out.println(str);
	    }

	    // sorting by character length
	    // 1. Comparator with anonymous class
	    /*
	    Collections.sort(strings, new Comparator<String>() {
	        @Override
	        public int compare(String s1, String s2) {
	            return s1.length() - s2.length();
	        }
	    });*/
	    
	    // 2. Lambda Expression
	    //Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
	    Collections.sort(strings, Comparator.comparingInt(String::length));	// 람다 비교 자리에 생성 메서드

	    System.out.println();
	    for (String str : strings) {
	        System.out.println(str);
	    }
	}
	
}
