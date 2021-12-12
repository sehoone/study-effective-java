package chapter3.item11;

import java.util.HashMap;
import java.util.Map;

public class Item11Main {

	public static void main(String[] args) {
		/**
		 * equals를 재정의 하려거든 hashCode도 재정의 하라
		 * equals를 재정의한 클래스 모두에서 hashCode도 재정의해야 한다. 해당 클래스의 인스턴스를 HashMap이나 HashSet 같은 컬렉션의 원소로 사용할 때 문제를 일으킬 것이다.
		 * 
		 * hashcode()를 재정의 하지 않으면 같은 값 객체라도 해시값이 다를 수 있다
		 * equals()를 재정의하지 않으면 hashcode()가 만든 해시값을 이용해 객체가 저장된 버킷을 찾을 수는 있지만 해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에 null을 리턴하게 된다. 
		 * 따라서 역시 원하는 객체를 찾을 수 없다
		 * 
		 * equals: 두객체의 내용이 같은지 확인
		 * hashcode: 두객체가 같은 객치인지 확인
		 * 
		 */
		Person pserson1 = new Person();
		pserson1.setAge(33);
		pserson1.setName("sehoone");
		
		Person pserson2 = new Person();
		pserson2.setAge(33);
		pserson2.setName("sehoone");
		
		System.out.println(pserson1 == pserson2);	// 객체 비교
		System.out.println(pserson1.equals(pserson2));	// == 과같음. 내용을 비교를 위해서 equal을 오버라이딩하여 재정의가능. 
		System.out.println(pserson1.hashCode());
		System.out.println(pserson2.hashCode());
		
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(pserson1, 111);
		map.put(pserson2, 111);
		System.out.println(map.size()); // 사이즈: 1. Hash를 사용한 Collection은 key를 결정할때 hashCode()를 사용하기 때문
		
	}

}
