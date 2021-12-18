package chapter4.item17;

public class Item17Main {

	public static void main(String[] args) {
		/**
		 * 변경 가능성을 최소화하라
		 * 불변 클래스는 가변 클래스보다 설계하고 구현하고 사용하기 쉬우며, 오류가 생길 여지도 적고 훨씬 안전하다.
		 * 1. 객체의 상태를 변경하는 메서드(변경자)를 제공하지 않는다.
		 * 2. 모든 필드를 final로 선언한다.
		 * 3. 모든 필드를 private으로 선언한다.
		 * 4. 자신 외에는 내부의 가변 컴포넌트에 접근할 수 없도록 한다. 이런 필드는 절대 클라이언트가 제공한 객체 참조를 가리키게 해서는 안 되며, 접근자 메서드가 그 필드를 그대로 반환해서도 안 된다. 생성자, 접근자, readObject 메서드 모두에서 방어적 복사를 수행하라
		 * 불변 객체는 근본적으로 스레드 안전하여 따로 동기화할 필요 없기 때문에 안심하고 공유할 수 있다. 따라서 불변 클래스라면 한번 만든 인스턴스를 최대한 재활용하기를 권한다.
		 */
		
		Complex complex1 = new Complex(2,5);
		//Complex complex2 = new Complex(3,6);
		System.out.println(complex1.plus(complex1));
		System.out.println(complex1.plus(complex1).hashCode());
		System.out.println(complex1.plus(complex1).hashCode());
	}

}
