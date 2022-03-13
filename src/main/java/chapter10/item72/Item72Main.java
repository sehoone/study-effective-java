package chapter10.item72;

public class Item72Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 표준 예외를 사용하라
		 * 
		 * 표준예외를 재사용하면 얻는게 많다. 그중 최고는 여러분의 API가 다른사람이 익히고 사용하기 쉬워진다는 것이다.
		 * 
		 * IllegalArgumentException: 허용하지 않는 값이 인수로 던져졌을 때(null은 따로 NullPointerException으로 처리)
		 * IllegalStateException: 객체가 메서드를 수행하기에는 적절하지 않은 상태일 때
		 * NullPointerException: null을 허용하지 않는 메서드에 null을 던졌을 때
		 * IndexOutOfBoundsException: 인덱스가 범위를 넘어섰을 때
		 * ConcurrentModificationException: 허용하지 않는 동시 수정이 발견되었을 때
		 * UnsupportedOperationException: 호출한 메서드를 지원하지 않을 때
		 * 
		 */
	}
}
