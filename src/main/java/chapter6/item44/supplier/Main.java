package chapter6.item44.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) throws Exception {

		/**
		 * Supplier : 매개변수X, 반환값O 
		 * - getXXX() 메소드를 제공하는 함수형 인터페이스 
		 * - 데이터를 공급하는 역할.
		 */

		Supplier<Integer> s1 = () -> {
			return 100;
		};

		System.out.println(s1.get());

		Supplier<List<User>> s4 = () -> {
			List<User> list = new ArrayList<User>();
			list.add(new User("세훈이", 20));
			list.add(new User("세훈이에요", 25));
			list.add(new User("세훈이요", 23));

			return list;

		};

		for (User user : s4.get()) {
			System.out.println(user);

		}
	}

}