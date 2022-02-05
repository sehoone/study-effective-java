package chapter7.item47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import chapter7.item46.Book;

public class Item47Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 반환 타입으로는 스트림보다 컬렉션이 낫다.
		 * 
		 */
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("book1", 2001, "sehoone1"));
		books.add(new Book("book2", 2002, "sehoone2"));
		books.add(new Book("book3", 2003, "sehoone3"));
		books.add(new Book("book4", 2004, "sehoone4"));
		
	    Item47Main.of(books).forEach(System.out::println);
	}

    public static <E> Stream<List<E>> of(List<E> list) {
        return Stream.concat(Stream.of(Collections.emptyList()),
                prefixes(list).flatMap(Item47Main::suffixes));
    }

    private static <E> Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1, list.size())
                .mapToObj(end -> list.subList(0, end));
    }

    private static <E> Stream<List<E>> suffixes(List<E> list) {
        return IntStream.range(0, list.size())
                .mapToObj(start -> list.subList(start, list.size()));
    }
}
