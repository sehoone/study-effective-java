package chapter10.item73;

public class Item73Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 추상화 수준에 맞는 예외를 던지라
		 * 
		 * 메서드가 저수준 예외를 처리하지 않고 바깥으로 전파(throws) 하는 경우에 대한 문제점
		 * 수행하려는 일과 관련없는 예외가 발생할 수 있다.
		 * 구현 방식을 바꾸면 또 다른 예외를 발생시켜 기존 클라이언트 프로그램을 깨뜨릴 수 있다.
		 * 
		 * 예외 번역
		 * 상위 계층에서는 저수준 예외를 잡아 자신의 추상화 수준에 맞는 예외로 바꿔 throw
		 * 예외 번역시 저수준 예외가 디버깅에 도움이 된다면 예외 연쇄(exception chaining) 를 사용하는 게 좋다.
		 * 
		 * 예외 연쇄
		 * 문제의 근본 원인(cause) 인 저수준 예외를 고수준 예외에 실어 보내는 방식이다.
		 * 이를 통해 별도의 접근자 메서드(Throwable의 getCause 메서드) 를 통해 필요하면 언제든 저수준 예외를 꺼내 볼 수 있다.
		 * 
		 */
		
	}
}
