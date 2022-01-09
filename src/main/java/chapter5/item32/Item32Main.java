package chapter5.item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Item32Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 제네릭과 가변인수를 함께 쓸 때는 신중하라
		 * 가변인수(T...) 메서드를 호출하면 가변인수를 담기 위한 배열이 자동으로 하나 만들어진다.
		 * 
		 * 두 조건을 모두 만족하는 제네릭 varargs 메서드는 안전하다. 둘 중 하나라도 어겼다면 수정하라
		 * varargs 매개변수 배열에 아무것도 저장하지 않는다.
		 * 그 배열(혹은 복제본)을 신뢰할 수 없는 코드에 노출하지 않는다.
		 * 
		 * 가변인수와 제네릭은 궁합이 좋지 않다. 가변인수 기능은 배열을 노출하여 추상화가 완벽하지 못하고, 배열과 제네릭의 타입 규칙이 서로 다르기 때문이다. 
		 * 메서드에 제네릭 (혹은 매개변수화된) varags 매개변수를 사용하고자 한다면, 
		 * 먼저 그 메서드가 타입 안전한지 확인한 다음 @SafeVarargs 애너테이션을 달아 사용하는 데 불편함이 없게끔 하자
		 * 
		 */
		
		//danferous(List.of("asd","ww","qq"), List.of("asd2","ww2","qq2"));
		
		//String[] attributes = pickTwo("좋은", "빠른", "저렴한");
		
		flatten(List.of("asd","ww","qq"), List.of("asd2","ww2","qq2"), List.of(1,2,3));
	}
	
	// 제네릭 varargs 배열 매개변수에 값을 저장하는것은 안전하지 않다
	//@SafeVarargs @SafeVarargs 애너테이션이 추가되어 제네릭 가변인수 메서드 작성자가 클라이언트 측에서 발생하는 경고를 숨길 수 있다
	static void danferous(List<String>... stringLists) {
		
	    List<Integer> intList = List.of(42, 22);
	    Object[] objects = stringLists;
	    objects[0] = intList; // 힙 오염 발생
	    String str = stringLists[0].get(0); // ClassCastException
	    
	    System.out.println(str);
	    
	}
	
	static <T> T[] toArray(T... args) {
	    return args;
	}
	static <T> T[] pickTwo(T a, T b, T c) {
	    switch(ThreadLocalRandom.current().nextInt(3)) {
	    case 0: return toArray(a, b);
	    case 1: return toArray(a, b);
	    case 2: return toArray(a, b);
	    }
	    throw new AssertionError(); // 도달할 수 없다. 
	}
	
	@SafeVarargs
	static <T> List<T> flatten(List<? extends T>... lists) {
	    List<T> result = new ArrayList<>();
	    for (List<? extends T> list : lists)
	    result.addAll(list);
	    System.out.println(result);
	    return result;
	}
	
	static <T> List<T> pickTwo2(T a, T b, T c) {
	    switch(ThreadLocalRandom.current().nextInt(3)) {
	    case 0: return List.of(a, b);
	    case 1: return List.of(a, b);
	    case 2: return List.of(a, b);
	    }
	    throw new AssertionError(); // 도달할 수 없다. 
	}
}
