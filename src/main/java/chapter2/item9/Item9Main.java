package chapter2.item9;

public class Item9Main {
    public static void main(String[] args) throws Exception {
    	
    	/** 1. hello 에서 exception 이 발생하면 자원회수가 안됨 **/
    	/*
    	Resource resource = new Resource();
    	resource.hello();
    	//exception
    	resource.close();
    	*/
    	
    	/** 2. finally를 사용하여 자원회수하는 방법 **/
    	/*
    	Resource resource = new Resource();
    	try {
    		resource.hello();
    	} finally {
    		resource.close();
    	}*/
    	
    	/** 3. finally를 사용하여 자원회수하는 방법 **/
    	try(Resource resource = new Resource()){
    		resource.hello();
    	}
    	
    	String aa ="";
    	String bb ="";
    	if(aa.equals(bb)) {}
    	
    	/**
    	 * try-finally보다는 try-with-resources를 사용하라
    	 * 자원 닫기는 클라이언트가 놓치기 쉬워서 예측할 수 없는 성능 문제로 이어지기도 한다.(전통적으로 자원이 제대로 닫힘을 보장하는 수단으로 try-finally가 쓰였다)
    	 * finally 를 사용하면 소스가 장황해지고, 만약에 exception이 try안, finally 안에서 exception이 발생하면 finally에서 발생한 exception만 보임
    	 * 
    	 * 꼭 회수해야 하는 자원을 다룰 때는 try-finally 말고 try-with-resources를 사용하자. 예외는 없다. 코드는 더 짧고 분명해지고, 만들어지는 예외 정보도 훨씬 유용하다. 
    	 * try-finally로 작성하면 실용적이지 못할 만큼 코드가 지저분 해지는 경우라도 try-wirh-resources 로는 정확하고 쉽게 자원을 회수할 수 있다.
    	 * 
    	 */
    }
    
}
