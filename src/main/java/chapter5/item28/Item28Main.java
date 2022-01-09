package chapter5.item28;

import java.util.ArrayList;
import java.util.List;

public class Item28Main {

	public static void main(String[] args) {
		/**
		 * 배열보다는 리스트를 사용하라 
		 * 배열은 실체화(relify)가 된다. 런타임 시 배열은 자신이 담고 있는 원소의 Type을 알고 있지만, 제너릭은 소거된다
		 */

		// 배열은 런타임 시 배열은 자신이 담고 있는 원소의 Type을 알고 있지만, 제너릭은 소거된다.
		Object[] objArray = new Long[1];
		// 런타임 애러발생. java.lang.ArrayStoreException: java.lang.String
		objArray[0] = "asd";

		// 리스트는 컴파일 시점에 타입애러 발생.
		List<Long> list = new ArrayList<Long>();
		// 컴파일 애러발생.
		// list.add("asd");

		/*
		List<String>[] stringLists = new ArrayList<String>[1]; // (1)
		List<Integer> intList = List.of(42); // (2)
		Object[] objects = stringLists; // (3)
		objects[0] = intList; // (4)
		String s = stringLists[0].get(0); // (5)
		*/
	}

}
