package chapter2.item8;

public class Finalizer {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("call finalize!!");
	}
	
	public void getName() {
		System.out.println("Finalizer sehoone");
	}
	
	//something

}
