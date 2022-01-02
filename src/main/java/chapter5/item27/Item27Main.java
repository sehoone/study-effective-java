package chapter5.item27;

import java.util.Arrays;

public class Item27Main {

	public static void main(String[] args) {
		/**
		 * 비검사 경고를 제거하라
		 * 경고를 제거할 수는 없지만 타입 안전하다고 확신할 수 있다면 @SuppressWarnings("unchecked") 어노테이션을 달아서 경고를 숨길 수 있다.
		 * 비검사 경고는 중요하니 무시하지말자. 모든 비검사 경고는 런타임에 classCastException을 일으킬수있다
		 */
	}
	
	//@SuppressWarnings("unchecked")
	private static <T> T[] toArray(T[] a) {
		int size = 0;
		Object[] elements = null;
		
	    if (a.length < size)
	        // Make a new array of a's runtime type, but my contents:
	        return (T[]) Arrays.copyOf(elements, size, a.getClass());
	    System.arraycopy(elements, 0, a, 0, size);
	    if (a.length > size)
	        a[size] = null;
	    return a;
	}
}
