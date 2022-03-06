package chapter9.item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class Item65Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		/**
		 * 리플렉션보다는 인터페이스를 사용해라
		 * 
		 * 리플렉션을 사용하면 임의의 클래스에 접근하면 그 클래스의 생성자, 메서드, 필드 인스턴스를 가져올 수 있다.
		 * 
		 * 단점
		 * 컴파일타임 타입 검사가 주는 이점을 하나도 누릴 수 없다
		 * 플렉션을 이용하면 코드가 지저분하고 장황해진다.
		 * 성능이 떨어진다(리플렉션을 통한 메서드 호출은 일반 메서드 호출보다 휄씬느리다)
		 * 
		 * 리플렉션은 복잡한 특수 시스템을 개발할떄 필요한 강력한 기능이지만 단점도 많다. 컴파일타임에는 알수없는 클래스를
		 * 사용하는 프로그램을 작성한다면 리플렉션을 사용해야할것이다.
		 * 되도록 객체생성에만 사용하고, 생성한 객체를 이용할때는 적절한 인터페이스나 컴파일타임에 알 수 있는 상위 클래스로 형변환해 사용해야한다.
		 * 
		 */
		
		Class<? extends Set<String>> cl = null;
		try {
			cl = (Class<? extends Set<String>>) // Unchecked cast!
			Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			fatalError("Class not found.");
		}

		// Get the constructor
		Constructor<? extends Set<String>> cons = null;
		try {
			cons = cl.getDeclaredConstructor();
		} catch (NoSuchMethodException e) {
			fatalError("No parameterless constructor");
		}

		// Instantiate the set
		Set<String> s = null;
		try {
			s = cons.newInstance();
		} catch (IllegalAccessException e) {
			fatalError("Constructor not accessible");
		} catch (InstantiationException e) {
			fatalError("Class not instantiable.");
		} catch (InvocationTargetException e) {
			fatalError("Constructor threw " + e.getCause());
		} catch (ClassCastException e) {
			fatalError("Class doesn't implement Set");
		}

		// Exercise the set
		s.addAll(Arrays.asList(args).subList(1, args.length));
		System.out.println(s);
	}

	private static void fatalError(String msg) {
		System.err.println(msg);
		System.exit(1);
	}
}
