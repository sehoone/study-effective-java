package chapter9.item58;

public class Item58Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 전통적인 for 문보다는 for-each문을 사용해라
		 * 
		 * 전통적인 for문과 비교시 for-each문 장점은 명료하고, 유연하고, 버그를 예방해준다. 그러면서 성능저하도 없다.
		 * 
		 * for-each문은 반복자나 인덱스 변수를 사용하지 않아 코드가 깔끔해지고, 오류가 발생할 일도 없다
		 * 하나의 관용구로 컬렉션과 배열 모두 처리할 수 있어, 어떤 컨테이너를 사용하는지 신경쓰지 않아도 된다.
		 * 
		 * for-each를 사용할 수 없는 경우
		 * 파괴적인 필터링(destructive filtering): 컬렉션을 순회하면서 선택된 원소를 제거해야 하는경우, 반복자의 remove 메서드를 호출해야한다.
		 * 변형(transforming): 리스트나 배열을 순회하면서 그 원소의 값 일부 혹은 전체를 교체해야한다면 리스트의 반복자는 배열의 인덱스를 사용해야한다.
		 * 병렬 반복(parallel iteration): 여러 컬렉션을 병렬로 순회해야한다면 각각의 반복자와 인텍스 변수를 사용해 엄격하고 명시적으로 제어해야한다
		 * 
		 */
		
	}
//	  enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }
//
//	  Collection<Face> faces = EnumSet.allOf(Face.class);
//
//	  // 전통적인 for 문
//	  for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
//	    for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
//	      System.out.println(i.next() + " " + j.next());
//	  
//	  // for-each문
//	  for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
//		    Suit suit = i.next();
//		    for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
//		      deck.add(new Card(suit, j.next())); 

}
