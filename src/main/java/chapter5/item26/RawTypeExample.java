package chapter5.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RawTypeExample {

	static class Stamp{
		public Stamp() {}
	}
	
	static class Coin{
		public Coin() {}
	}
	
	private final static Collection stamps = new ArrayList<>();
	
	public static void main(String[] args) {
		
		stamps.add(new Coin());
		
		for(Iterator i = stamps.iterator(); i.hasNext();) {
			Stamp stamp = (Stamp) i.next();
		}
		/**
		 * raw타입으로 선언된 collection에 의도와는 다른것을 넣을때, 런타입에서 error발생
		 * class chapter5.item26.RawTypeExample$Coin cannot be cast to class chapter5.item26.RawTypeExample$Stamp 
		 * (chapter5.item26.RawTypeExample$Coin and chapter5.item26.RawTypeExample$Stamp are in unnamed module of loader 'app')
		 */
	}

}
