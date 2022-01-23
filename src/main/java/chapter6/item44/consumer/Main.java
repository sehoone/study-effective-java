package chapter6.item44.consumer;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/** Consumer : 매개변수O, 반환값X -> 추상메소드 제공.
		 *  - accept() 메소드를 제공하는 함수형 인터페이스
		 *  - 매개변수를 받아서 소비하는 일을 구현하는 역할.
		 *  - 다양한 오버로딩 지원.
		 */
		
		// Lambda
		MyConsumer c1 = (txt) -> {
			System.out.println("결과 : " + txt);
		};
		c1.accept("홍길동");
		
		// Consumer 
		Consumer<String> c2 = (txt) -> System.out.println("결과 : " + txt);
		c2.accept("홍길동");
	}
	
}