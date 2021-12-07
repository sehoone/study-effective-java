package chapter2.item9;

public class Resource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("call close!!");
		//throw new Exception();
	}
	
	public void hello() throws Exception {
		System.out.println("hello!!");
		//throw new Exception();
	}

}
