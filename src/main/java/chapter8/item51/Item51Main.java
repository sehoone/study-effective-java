package chapter8.item51;

public class Item51Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 메서드 시그니처를 신중히 설계해라
		 * 
		 * 1. 메서드 이름을 신중히 짓자
		 * 이해할 수 있고, 같은 패키지에 속한 다른 이름과 일관되게 짓는 것이 최우선 목표이다.
		 * 
		 * 2. 편의 메서드를 너무 많이 만들지 말자
		 * 메서드가 너무 많은 클래스는 익히고, 사용하고, 문서화하고, 테스트하고, 유지보수 하기 어렵다. 클래스나 인터페이스는 자신의 각 기능을 완벽히 수행하는 메서드로 제공해야한다. 아주 자주 사용하는 경우에만 별도의 약칭 메서드를 두고, 확신이 없으면 만들지 말자.
		 * 
		 * 3. 매개변수 목록은 짧게 유지하자
		 * 매개변수 목록은 4개 이하가 적당하다. 같은 타입의 매개변수 여러 개가 연달아 나오는 경우가 특히 좋지 않다. 매개변수 순서를 기억하기도 어려우며, 실수로 순서를 바꿔 입력해도 오류가 발생하지 않기 때문이다.
		 * 
		 * 4. 매개변수의 타입으로는 클래스보다 인터페이스가 낫다
		 * 매개변수로 적합한 인터페이스가 있으면, 인터페이스를 직접 사용하자. ex. 메서드에 Map 을 사용하면, HashMap, TreeMap, ConcurrentHashMap 등 어떠한 Map 구현체도 인수로 받을 수 있다.
		 * 
		 * 5. boolean보다 원소 2개짜리 열거 타입이 낫다
		 * 열거타입을 사용하면, 코드를 읽고 쓰기가 더 쉬워지며, 나중에 선택지를 추가하기도 쉽다. 매서드 이름상 boolean이 명확할때는 예외
		 * 
		 */
		
	}

}
