package chapter11.item83;

public class Item83Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 지연 초기화는 신중히 사용하라
		 * 
		 * 지연초기화(lazy initialization): 필드의 초기화 시점을 그 값이 처음 필요할 때까지 늦추는 기법. 주로 최적화 용도로 사용
		 * 
		 * 지연초기화를 사용한다면 인스턴스 생성 시의 초기화 비용은 줄지만 그 대신 필드에 접근하는 비용은 커진다.
		 * 즉 지연 초기화 필드중 초기화가 이뤄지는 비율에 따라, 실제 초기화에 드는 비용에따라, 초기화된 각 필드를 얼마나 빈번히 호출하느냐에 따라
		 * 지연 초기화가 실제로는 성능을 느려지게 할 수 있다.
		 * 
		 * 대부분의 필드는 지연시키지말고 곧바로 초기화해야한다. 성능때문에 혹은 위험한 초기화 순환을 막기 위해 꼭 지연 초기화를 써야한다면
		 * 올바은 지연 초기화 기법을 사용하자. 인스턴스 필드에는 이중검사 관용구, 정적 필드에는 지연 초기화 홀더 클래스 관용구를 사용하자.
		 */
		
	}
	
	// 일반적인 초기화
	public class TestClass1 {
	    private final Person person = createPerson();

	    private Person createPerson() {
	        return new Person("sehoon", 10);
	    }
	}
	
	// 인스턴스 필드의 지연초기화
	public class TestClass2 {
	    private Person person;

	    public synchronized  Person getPerson(){
	        if(person==null){
	        	person = createPerson();
	        }
	        return person;
	    }
	    private Person createPerson() {
	        return new Person("sehoon", 10);
	    }
	}
	
	// 정적 필드용 지연 초기화 홀더 클래스 관용구. 클래스가 처음 쓰일 때 비로소 초기화 된다는 특성을 이용한 관용구다
//	public class TestClass3 {
//
//	    static final private Person person = createPerson();
//
//	    private static Person createPerson() {
//	        return new Person("sehoon", 10);
//	    }
//
//	    public static Person getPerson(){
//	        return TestClass3.person;
//	    }
//	}
	
	// 이중검사 관용구. 인스턴스 필드를 지연 초기화해야한다면 사용. 필드가 초기화 된 후로는 동기화 하지 않으므로 해당 필드는 반드시 volatile로 선언한다.
	public class TestClass4 {

	    private volatile Person person;

	    private Person createPerson() {
	        return new Person("sehoon", 10);
	    }

	    public Person getPerson() {
	    	Person result = person;
	        if(result!=null){
	            return result;
	        }
	        synchronized (this){
	            if(person == null){
	            	person = createPerson();
	            }
	            return person;
	        }
	    }
	}
}
