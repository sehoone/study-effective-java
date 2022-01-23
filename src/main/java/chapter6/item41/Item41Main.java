package chapter6.item41;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class Item41Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 정의하려는 것이 타입이라면 마커 인터페이스를 사용해라
		 * 
		 * 마커 인터페이스(marker interface)란, 일반적인 인터페이스와 동일하지만, 아무 메서드도 선언하지 않은 인터페이스이다. 
		 * 자바의 대표적인 마커 인터페이스로는 Serializable, Cloneable, EventListener가 있다. 대부분의 경우 마커 인터페이스를 단순한 타입 체크를 하기 위해 사용한다.
		 * 
		 */
		File f= new File("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(new Item(1L, "item A", new BigDecimal(30000)));
	}
	
}
