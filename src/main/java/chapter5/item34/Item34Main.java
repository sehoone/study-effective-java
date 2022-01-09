package chapter5.item34;

public class Item34Main {

	public static void main(String[] args) throws Exception {
		/**
		 * int 상수 대신 열거 타입을 사용하라
		 * 
		 * 정수 열거 패턴 기법에는 단점이 많다.
		 * 1. 타입 안전을 보장할 방법이 없으며 표현력도 좋지 않다.
		 * 2. 상수의 값이 바뀌면 클라이언트도 반드시 다시 컴파일해야 한다. 다시 컴파일하지 않은 클라이언트는 실행이 되더라도 엉뚱하게 동작할 것이다.
		 * 3. 정수 상수는 문자열로 출력하기가 다소 까다롭다. 심지어 그 안에 상수가 몇 개 인지도 알 수 없다.
		 * 4. 정수 대신 문자열 상수를 사용하는 변형하는 패턴도 있지만, 상수의 의미를 출력할 수 있다는 점은 좋지만 문자열 상수의 이름 대신 문자열 값을 그대로 사용하면 오타가 있어도 컴파일러는 확인할 길이 없으니 자연스럽게 런타임 버그가 생긴다.
		 * 
		 * 열거 타입을 쓰면 어떤 부분이 장점이 있을까
		 * 1. 열거 타입 자체는 클래스이며, 상수 하나당 자신의 인스턴스를 하나씩 만들어 public static final 필드로 공개한다. 열거 타입은 밖에서 접근할 수 있는 생성자를 제공하지 않으므로 사실상 final이다.
		 * 2. 열거 타입은 컴파일 타임 타입 안전성을 제공한다.
		 * 3. 열거 타입에는 각자의 이름 공간이 있어서 이름이 같은 상수도 평화롭게 공존한다.
		 * 4. 열거 타입에 새로운 상수를 추가하거나 순서를 바꿔도 다시 컴파일하지 않아도 된다.
		 * 5. 열거 타입에는 임의의 메서드나 필드를 추가할 수 있고 임의의 인터페이스를 구현하게 할 수도 있다.
		 * 6. 열거 타입은 자신 안에 정의된 상수 들의 값을 배열에 담아 반환하는 정적 메서드인 values를 제공한다.
		 */

		double x = Double.parseDouble("1");
		double y = Double.parseDouble("20");
		
		//Operation op1 = new Operation();	// 이건 타입임 인스턴스가 아님
		System.out.println(Operation.PLUS.apply(x, y));
		
		for(Operation op: Operation.values()) {
			System.out.println(op.toString()+ " " + op.apply(x, y));
		}
	}
	
	static class Apple {
		public static final int APPLE_FUJI = 0;
		public static final int APPLE_PIPPIN = 1;
		public static final int APPLE_GRANNY_SMITH = 2;
		
		public static final int APPLE1_FUJI = 0;
		public static final int APPLE1_PIPPIN = 1;
		public static final int APPLE1_GRANNY_SMITH = 2;
	}
	
	static class Fruit {
		public enum Apple{FUJI, PIPPIN};
		
	}
	
}
