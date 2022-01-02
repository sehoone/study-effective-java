package chapter5.item29;

public class Item29Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 이왕이면 제너릭 타입으로 만들라 
		 * 클라이언트에서 직접 형변환을 안해도 되게끔 제네릭 타입으로 만들자.
		 * 
		 * Type Parameter Naming Conventions
		 * E — Element (used extensively by the Java Collections Framework) 
		 * K — Key 
		 * N — Number 
		 * T — Type 
		 * V — Value 
		 * S,U,V etc. — 2nd, 3rd, 4th types
		 */
		String[] args1 = { "asd", "ds", "qwe" };
		Stack1<String> stack = new Stack1<>();
		for (String arg : args1) {
			stack.push(arg);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toLowerCase());
		}
	}

}
