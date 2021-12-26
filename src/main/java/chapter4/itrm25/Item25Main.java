package chapter4.itrm25;

public class Item25Main {

	public static void main(String[] args) {
		/**
		 * 톱레벨 클래스는 한 파일에 하나만 담으라
		 * 소스 파일 하나에는 반드시 톱레벨 클래스(혹은 톱레벨 인터페이스)를 하나만 담자. 이 규칙만 따른다면 컴파일러가 한 클래스에 대한 정의를 여러 개 만들어 내는 일은 사라진다
		 * 어느 것을 사용할지는 어느 소스 파일을 먼저 컴파일하냐에 따라 달라지기 때문에 사용을 권장 하지는 않는다.
		 */
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

}
