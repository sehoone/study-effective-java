package chapter10.item70;

public class Item70Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 복구할 수 있는 상황에는 검사 예외를, 프로그래밍 오류에는 런타임 예외를 사용하라
		 * 
		 * 자바는 문제 상황을 알리는 타입(throwable)으로 검사 예외, 런타임 예외, 에러, 이렇게 세 가지를 제공하는데, 
		 * 언제 무엇을 사용해야 하는지 헷갈려 하는 프로그래머들이 종종 있다.
		 * 
		 * java의 예외처리는 throwable을 모두 상속하고 있으면 크게 exception, error로 나뉜다
		 * exception은 check형 검사예외이고, runtimeException은 unchecked형 비검사 예외이다
		 * 
		 * 호출하는 쪽에서 복구하리라 여겨지는 상황이라면 검사예외를 사용하라
		 * 
		 * 프로그래밍 오류를 나타낼 때는 런타임 예외를 사용하자.
		 * 
		 * 에러(error)는 보통 jvm의 자원부족, 불변식 깨짐 등 더이상 수행할 수 없는 상황을 나타낼때 사용한다.
		 * error클래스를 상속해 하위클래스를 만드는 일은 자제하기 바란다.
		 * 
		 * exception 상속 관계
		 * https://otrodevym.tistory.com/entry/Java-%EA%B2%80%EC%82%AC-%EC%98%88%EC%99%B8Checked-%EC%99%80-%EB%B9%84%EA%B2%80%EC%82%AC-%EC%98%88%EC%99%B8UnChecked
		 */
		
	}
}
