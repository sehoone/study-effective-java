package chapter2.item8;

public class Item8Main {
    public static void main(String[] args) throws InterruptedException {
    	Item8Main main = new Item8Main(); 
    	main.run();
    	//System.gc();
    	System.out.println("sleep start");
    	Thread.sleep(5000);
    	System.out.println("sleep end");
    	System.gc();
    	
    	/**
    	 * finalizer와 cleaner 사용을 피하라
    	 * finalizer와 cleaner는 즉시 수행된다는 보장이 없다
    	 * 자바 9에서는 finalizer를 사용 자제(deprecated) API로 지정하고 cleaner를 그 대안으로 소개했다. 
    	 * cleaner는 finalizer보다는 덜 위험하지만, 여전히 예측할 수 없고, 느리고, 일반적으로 불필요하다.
    	 * 
    	 * 자바에서는 try-with-resources와 try-finally를 사용해 해결한다.
    	 */
    }
    
    private void run() {
    	Finalizer finer = new Finalizer();
    	finer.getName();
    }
}
