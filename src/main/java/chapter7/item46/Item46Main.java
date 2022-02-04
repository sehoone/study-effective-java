package chapter7.item46;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Item46Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 스트림에서 부작용 없는 함수를 사용해라
		 * 
		 * 스트림 패러다임의 핵심은 계산을 일련의 변환으로 재구성하는 부분이다. 각 변환 단계는 가능한 이전 단계의 결과를 받아 처리하는 순수 함수여야한다.
		 * 순수함수 : 오직 입력만이 결과에 영향을 주는 함수
		 * 
		 * 스트림의 원소는 Collector를 통해서 Collection으로 변환가능하다
		 * toList(), toMap(), groupingBy(), partitionBy(), minBy(), maxBy(), joining()
		 */
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("book1", 2001, "sehoone1"));
		books.add(new Book("book2", 2002, "sehoone2"));
		books.add(new Book("book3", 2003, "sehoone3"));
		books.add(new Book("book4", 2004, "sehoone4"));
		
		//books.add(new Book("book5", 2002, "sehoone5"));
		//books.add(new Book("book6", 2003, "sehoone6"));
		
		// 1. toList example.
		List<Book> reverseBooks = books.stream()
				.sorted(Comparator.comparing(Book::getReleaseYear).reversed())
				.collect(Collectors.toList());
		reverseBooks.forEach((book)->{
			System.out.println("releaseYear " + book.getReleaseYear() + " name " + book.getName());
		});
		
		// 2-1. toMap example. key가 중복되면 exception발생
		Map<Integer, String> bookMap1 = books.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName));
		bookMap1.forEach((key, val)->{
			System.out.println("bookMap1 key " + key + " value " + val);
		});
		
		// 2-2. toMap example. key가 중복되면 3번째 파라메터로 merge처리
		books.add(new Book("book5", 2002, "sehoone5"));
		books.add(new Book("book6", 2003, "sehoone6"));
		Map<Integer, String> bookMap2 = books.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName, (s, a) -> s + ", " + a));
		bookMap2.forEach((key, val)->{
			System.out.println("bookMap2 key " + key + " value " + val);
		});
		
		// 2-3. toMap example. key가 중복되면 3번째 파라메터로 merge처리, 4번째 파라메터로 리턴처리
		LinkedHashMap<Integer, String> bookMap3 = books.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName, (s, a) -> s + ", " + a, LinkedHashMap::new));
		bookMap3.forEach((key, val)->{
			System.out.println("bookMap3 key " + key + " value " + val);
		});
		
		// 3. groupingBy example.입력으로 분류 함수(classifier)를 받고 출력으로 원소들을 카테고리별로 모아 놓은 맵을 담은 수집기 반환한다.
		Map<Integer, List<Book>> bookMap4 = books.stream().collect(Collectors.groupingBy(Book::getReleaseYear));
		bookMap4.forEach((key, val)->{
			System.out.println("bookMap4 key " + key + " value " + val);
		});
	}
	
}
