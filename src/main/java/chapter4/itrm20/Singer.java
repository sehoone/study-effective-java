package chapter4.itrm20;

public interface Singer{
	public static final String aaa = "hello";
	void sing();
	default void name(String name) {
		System.out.println("your name " + name);
	}
	public static void hello() {
		System.out.print("hello");
	}
}