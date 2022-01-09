package chapter5.item31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Item31Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 한정적 와일드카드를 사용해 API 유연성을 높이라
		 * 한정적 와일드카드 타입이라는 특별한 매개변수화 타입을 지원한다. 하위타입을 선언할때, 와일드카드 타입 타입<? extends E> 과 같이 사용
		 * 
		 * 메서드 선언에 타입 매개변수가 한 번만 나오면 와일드카드로 대체하라. ??
		 * 이때 비한정적 타입 매개변수라면 비한정적 와일드카드로 바꾸고, 한정적 타입 매개변수라면 한정적 와일드 카드로 바꾸면 된다. ??
		 * 
		 */
		Stack1<Number> numberStack = new Stack1<>(); // Number 타입 스택 생성
		List<Number> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(5);
		//The method pushAll(Iterable<Number>) in the type Stack1<Number> is not applicable for the arguments (List<Integer>)
		numberStack.pushAll(list);
		
		
		Set<Integer> integers = Set.of(1,3,5);
		Set<Integer> integers2 = Set.of(1,3,5);
		Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
		union2(integers, integers2);
	}
	
	public static <E> Set<E> union1(Set<E> s1, Set<E> s2) {
		  Set<E> result = new HashSet<>(s1);
		  result.addAll(s2);
		  return result;
	}
	
	public static <E> Set<E> union2(Set<? extends E> s1, Set<? extends E> s2) {
		  Set<E> result = new HashSet<>(s1);
		  result.addAll(s2);
		  return result;
	}
}
