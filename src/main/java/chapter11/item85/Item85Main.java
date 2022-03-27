package chapter11.item85;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import com.google.gson.Gson;

public class Item85Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 자바 직렬화의 대안을 찾으라
		 * 
		 * java.io.Serializable 인터페이스를 상속받은 객체를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술
		 * 역직렬화는 반대로 byte로 변환된 data를 Object로 변환하는 기술
		 * 
		 * 직렬화는 위험하니 피해야한다. 시스템을 밑바닥부터 설계한다면 json이나 프로토콜버퍼 같은 대한을 사용하자.
		 * 신뢰할 수 없는 데이터는 역직렬화하지말자.
		 * 꼭 해야한다면 객체 역직렬화 필터링을 사용하되, 이마저도 모든 공격을 막아줄 수는 없음을 기억하지
		 */
		
		// 직렬화
		Person person = new Person("sehoone", 11);
	    byte[] serializedPerson;
	    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
	            oos.writeObject(person);
	            serializedPerson = baos.toByteArray();
	        }
	    }
	    System.out.println(Base64.getEncoder().encodeToString(serializedPerson));
	    String serializedPerson2 = Base64.getEncoder().encodeToString(serializedPerson);
	    
	    // 역직렬화
	    byte[] serializedMember = Base64.getDecoder().decode(serializedPerson2);
	    try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
	        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
	            // 역직렬화된 Member 객체를 읽어온다.
	            Object objectMember = ois.readObject();
	            Person person1 = (Person) objectMember;
	            System.out.println(person1);
	        }
	    }
	    
	    // json
	    Gson gson = new Gson();
	    String json = gson.toJson(person);
	    System.out.println(json);
	}
	
}
