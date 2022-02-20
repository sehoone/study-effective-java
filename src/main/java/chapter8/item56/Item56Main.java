package chapter8.item56;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Item56Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 공개된 API 요소에는 항상 주석을 작성해라
		 * 
		 * 자바독(javadoc) 유틸리티를 사용해 소스코드 파일에서 문서화 주석이라는 특수한 형태로 기술된 설명을 추려 API문서로 변환할 수 있다.
		 * API를 올바르게 문서화하려면 공개된 모든 클래스, 인터페이스, 메서드, 필드 선언에 문서화 주석을 달아야한다.
		 * 
		 * 메서드용 문서화 주석에는 해당 메서드와 클라이언트 사이 규약을 명확하게 기술해야한다.
		 * 상속용으로 설계된 클래스의 메서드가 아니라면, 어떻게 동작하는게 아닌 무엇(what)을 하는지 기술해야한다.
		 * 
		 * 필수
		 * @param 태그 : 모든 매개변수에 추가
		 * @return 태그 : 반환 타입이 void가 아니라면 필수. 메서드 설명과 동일한 경우 생략 가능
		 * @throws 태그 : 발생할 가능성이 있는 모든 예외에 추가
		 * 
		 * @implSpec : 해당 메서드와 하위 클래스 사이의 관계를 설명
		 * 
		 * 문서화 주석은 API를 문서화하는 효과적인 방법이다. 공개 API라면 빠짐없이 설명을 달아야하고, 표준 규약을 일관되게 지키자
		 * 
		 */
		
        //List<String> words = Arrays.asList("a", "c", "b");
        List<String> words = new ArrayList<String>();
        System.out.println(max(words));

        // Using an optional to provide a chosen default value (Page 251)
        String lastWordInLexicon = max(words).orElse("No words...");
        System.out.println(lastWordInLexicon);
	}

//  public static <E extends Comparable<E>> E max(Collection<E> c) {
//  if (c.isEmpty())
//      throw new IllegalArgumentException("Empty collection");
//
//  E result = null;
//  for (E e : c)
//      if (result == null || e.compareTo(result) > 0)
//          result = Objects.requireNonNull(e);
//
//  return result;
//}
	
  // Returns maximum value in collection as an Optional<E> (Page 250)
//  public static <E extends Comparable<E>>
//  Optional<E> max(Collection<E> c) {
//      if (c.isEmpty())
//          return Optional.empty();
//
//      E result = null;
//      for (E e : c)
//          if (result == null || e.compareTo(result) > 0)
//              result = Objects.requireNonNull(e);
//
//      return Optional.of(result);
//  }

  /**
   * Returns max val
   * 
   * @param Collection<E> max값을 얻으려는 collection
   * @return collection 의 max값
   */
  public static <E extends Comparable<E>>
  Optional<E> max(Collection<E> c) {
      return c.stream().max(Comparator.naturalOrder());
  }
  
}
