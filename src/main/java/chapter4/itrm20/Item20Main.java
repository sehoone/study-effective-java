package chapter4.itrm20;

public class Item20Main {

	public static void main(String[] args) {
		/**
		 * 추상 클래스보다는 인터페이스를 우선하라
		 * 자바가 제공하는 다중 구현 메커니즘은 인터페이스와 추상 클래스, 이렇게 두 가지다. 
		 * 자바는 단일 상속만 지원하니, 추상 클래스 방식은 새로운 타입을 정의하는 데 커다란 제약을 안게 되는 셈이다. 
		 * 반면 인터페이스가 선언한 메서드를 모두 정의하고 그 일반 규약을 잘 지킨 클래스라면 다른 어떤 클래스를 상속 했든 같은 타입으로 취급된다.
		 * 일반적으로 다중 구현용 타입으로는 인터페이스가 가장 적합하다. 복잡한 인터페이스 라면 구현하는 수고를 덜어주는 골격 구현을 함께 제공하는 방법을 꼭 고려 해보자.
		 */
		
		BoroadCast test = new BoroadCast();
		test.sing();
		test.writeSong();
		test.name("sehoone");
		
		
		Cat cat = new Cat();
		cat.hello();
		
		CustomInterface<String> customInterface = () -> "Hello Custom";

		// abstract method
		String s = customInterface.myCall();
		System.out.println(s);

		// default method
		customInterface.printDefault();

		// static method
		//CustomFunctionalInterface.printStatic();
	}

}
