package chapter10.item76;

public class Item76Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 가능한 한 실패 원자적으로 만들라
		 * 
		 * 호출된 메서드가 실패하더라도 해당 객체는 메서드 호출 전 상태를 유지해야 한다
		 * 
		 * 가장 간단한 방법은 불변 객체로 설계하는 것이다. 
		 * 불변 객체는 실패 원자적이다. 메서드가 실패하면 새로운 객체가 만들어지지 않을 수는 있으나, 기존 객체가 불안정한 상태에 빠지는 일은 결코 없다.
		 * 작업수행하기전 매개변수의 유효성을 검사하는것이다
		 * 
		 * 또 다른 방법은 객체의 임시 복사본에서 작업을 수행한 다음, 작업이 성공적으로 완료되면 원래 객체와 교체하는 것이다
		 */
		
	}
}
