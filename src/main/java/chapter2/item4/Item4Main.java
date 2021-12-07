package chapter2.item4;

public class Item4Main {

	public static void main(String[] args) {
		/**
		 * 정적멤머만 담은 유틸리티 클래스는 인스턴스로 만들어 쓰려고 설계한게 아니다
		 * 하지만 생성자를 명시하지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다
		 * 
		 * private 생성자를 추가하면 클래스의 인스턴스화를 막을수 있다
		 */
		
		// UtilityClass test = new UtilityClass();
		
		System.out.println(UtilityClass.getSehoon());
	}

}
