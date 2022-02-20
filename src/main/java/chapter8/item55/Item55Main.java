package chapter8.item55;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Item55Main {

	public static void main(String[] args) throws Exception {
		/**
		 * Optional 반환은 신중하게 해라
		 * 
		 * 값을 반환할 수 없는 경우
		 * 자바8이전: exception or null 을 반환
		 * 자바8이후: exception or null or Optional을 반환 
		 * 유요한 값이 없는 경우 빈 결과를 반환. 예외를 던지는 메서드보다 유연하고, 사용하기 쉬움. null을 반환하는 메서드보다 오류 가능성이 적음
		 * Optional.empty(); Optional.of(v);
		 * 
		 * 
		 * 값을 반환하지 못할 가능성이 있고, 호출할 때마다 반환값이 없을 가능성을 염두에 둬야 하는 메서드라면 
		 * 옵셔널반환을 할 상황일 수 있다. 하지만 옵셔널 반환에는 성능거하가 뒤따르니 성능에 민감한 메서드라면 null or 예외처리를 하는게 나을수도 있다.
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

  // Returns max val in collection as Optional<E> - uses stream (Page 250)
  public static <E extends Comparable<E>>
  Optional<E> max(Collection<E> c) {
      return c.stream().max(Comparator.naturalOrder());
  }
  
}
