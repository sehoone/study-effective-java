package chapter2.item5;

public class Item5Main2 {
	public static void main(String[] args) {
		//CoffeeMaker coffeeMaker = new CoffeeMaker(Injection.provideHeater(),Injection.providePump());
		//coffeeMaker.brew();
		Injection.provideCoffeeMaker().brew();
		
		/**
		 * 의존객체 주입
		 * 사용하는 자원에따라 달라지는 클래스는 정적유틸리티 클래스나 싱글턴 방식이 적합하지 않다
		 * 필요한 자원을 혹은 그자원을 만들어주는 팩토리를 생성자에 넘겨주자.
		 * 
		 */
	}
}
