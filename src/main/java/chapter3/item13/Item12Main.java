package chapter3.item13;

public class Item12Main {

	public static void main(String[] args) {
		/**
		 * toString을 항상 재정의하라
		 * toString을 잘 구현한 클래스는 사용하기에 훨씬 즐겁고, 그 클래스를 사용한 시스템은 디버깅하기 쉽다.
		 * 모든 구체 클래스에서 Object의 toString을 재정의하자. 상위 클래스에서 이미 알맞게 재정의한 경우는 예외다
		 */
		Person pserson1 = new Person();
		pserson1.setAge(33);
		pserson1.setName("sehoone");
		
		System.out.println(pserson1.toString());
	}

}
