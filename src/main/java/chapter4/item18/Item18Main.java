package chapter4.item18;

import java.util.HashSet;
import java.util.List;

public class Item18Main {

	public static void main(String[] args) {
		/**
		 * 상속보다는 컴포지션을 사용하라
		 * 상위 클래스와 하위 클래스를 모두 같은 프로그래머가 통제하는 패키지 안에서라면 상속도 안전한 방법이다.
		 *  
		 * 확장할 목적으로 설계 되었고 문서화도 잘 된 클래스도 마찬가지로 안전하다. 하지만 일반적인 구체 클래스를 패키지 경계를 넘어, 즉 다른 패키지의 구체 클래스를 상속하는 일은 위험하다.
		 * 상속은 강력하지만 캡슐화를 해틴다는 문제가 있다. 상속은 상위 클래스와 하위 클래스가 순수한 is-a 관계일 때도 안심할 수만은 없는 게, 
		 * 하위 클래스의 패키지가 상위 클래스와 다르고, 상위 클래스가 확장을 고려해 설계되지 않았다면 여전히 문제가 될 수 있다. 상속의 취약점을 피하려면 상속 대신 컴포지션과 전달을 사용하자. 
		 * 특히 래퍼 클래스로 구현할 적당한 인터페이스가 있다면 더욱 그렇다. 래퍼 클래스는 하위 클래스보다 견고하고 강력하다.
		 */
		
		InstrumentedSet<String> test1 = new InstrumentedSet<>(new HashSet<>());
		test1.addAll(List.of("aa", "bb", "cc"));
		System.out.println(test1.getAddCount());
		
		InstrumentedHashSet<String> test2 = new InstrumentedHashSet<>();
		test2.addAll(List.of("aa", "bb", "cc"));
		System.out.println(test2.getAddCount());
	}

}
