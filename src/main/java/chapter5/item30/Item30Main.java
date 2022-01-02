package chapter5.item30;

import java.util.HashSet;
import java.util.Set;

public class Item30Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 이왕이면 제네릭 메서드로 만들라 
		 * 클라이언트에서 직접 형변환을 안해도 되게끔 제네릭 타입으로 만들자.
		 * 
		 */
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(2);
		System.out.println(union(s1, s2));
		System.out.println(union2(s1, s2));
		
		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(1);
		Set<String> s4 = new HashSet<String>();
		s4.add("ee");
		s4.add("ww");
		System.out.println(union(s3, s4));
	}
	public static Set union(Set s1, Set s2) {
		  Set result = new HashSet<>(s1);
		  result.addAll(s2);
		  return result;
	}

	public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
		  Set<E> result = new HashSet<>(s1);
		  result.addAll(s2);
		  return result;
	}
}
