package chapter10.item71;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Item71Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 필요 없는 검사 예외 사용은 피하라
		 * 
		 * 검사 예외를 제대로 활용하면 API와 프로그램의 질을 높일 수 있다.
		 * 검사 에외는 발생한 문제를 프로그래머가 처리하여 안전성을 높이게끔 해준다.
		 * 
		 * 검사 예외를 회피하는 방법
		 * 적절한 결과 타입을 담은 Optional을 반환
		 * 검사 예외를 던지는 메서드를 2개로 쪼개 비검사 예외로 변환
		 */
		
		Map<Integer, String> cities = new HashMap<>();
		cities.put(1, "Seoul");
		cities.put(2, "Busan");
		cities.put(3, "Daejeon");
		
		String city = cities.get(4); // returns null
		int length1 = city == null ? 0 : city.length(); // null check
		System.out.println("length1: " + length1);
		
		Optional<String> maybeCity = Optional.ofNullable(cities.get(4)); // Optional
		int length2 = maybeCity.map(String::length).orElse(0); // null-safe
		System.out.println("length2: " + length2);
	}
}
