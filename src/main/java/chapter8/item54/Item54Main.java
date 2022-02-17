package chapter8.item54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item54Main {

	public static void main(String[] args) throws Exception {
		/**
		 * null이 아닌, 빈 컬렉션이나 배열을 반환해라
		 * 
		 * 빈컨테이너를 null 대신 반환해야하는 이유는 다음과 같다.
		 * 성능 분석 결과 할당이 성능 저하의 주범이라고 확인되지 않는 한, 이 정도의 성능 차이는 신경 쓸 정고가 아니다.
		 * 빈 컬렉션과 배열은 굳이 새로 할당하지 않고도 반환할 수 있다.
		 * 
		 * null을 반환하는 API는 사용하기 어렵고 오류처리 코드도 늘어난다. 그렇다고 성능이 좋은것도 아니다
		 * 
		 */
		
		String[] input = { "test", "qq" };
		List<String> cheeses1 = getCheeses1(input);
		// 메서드에서 null을 반환한다면 클라이언트는 null처리를 해줘야함. 즉 방어 코드를 넣어줘야한다
		if (cheeses1 != null && cheeses1.contains("test")) {
			System.out.println("contain test");
		}
		
		List<String> cheeses2 = getCheeses2(input);
		// 메서드에서 null을 반환한다면 클라이언트는 null처리를 해줘야함
		if (cheeses2.contains("test")) {
			System.out.println("contain test");
		}

	}

	static List<String> cheesesInStock = new ArrayList<String>();

	/**
	 * @return cheesesInStock 이 없으면 null반환
	 */
	public static List<String> getCheeses1(String[] input) {
		cheesesInStock = Arrays.asList(input);
		return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
	}

	/**
	 * @return cheesesInStock 이 없으면 빈 list를 응답
	 */
	public static List<String> getCheeses2(String[] input) {
		cheesesInStock = Arrays.asList(input);
		return new ArrayList<>(cheesesInStock);
	}

}
