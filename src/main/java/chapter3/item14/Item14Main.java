package chapter3.item14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Item14Main {

	public static void main(String[] args) {
		/**
		 * Comparable을 구현할지 고려하라
		 * compareTo는 단순 동치성 비교에 더해 순서까지 비교할 수 있으며 제내릭하다. Comparable을 구현했다는 것은 그 클래스의 인스턴스들에는 자연적인 순서가 있음을 뜻한다.
		 * Comparable을 구현한 클래스를 확장해 값 컴포넌트를 추가하고 싶다면, 확장하는 대신 독립된 클래스를 만들고, 이 클래스에 원래 클래스의 인스턴스를 가리키는 필드를 두자.
		 */
		Person pserson1 = new Person();
		pserson1.setAge(33);
		
		Person pserson2 = new Person();
		pserson2.setAge(10);
		
		Person pserson3 = new Person();
		pserson3.setAge(40);
		
		Person pserson4 = new Person();
		pserson4.setAge(20);
		
		List<Person> testList = new ArrayList<Person>();
		testList.add(pserson1);
		testList.add(pserson2);
		testList.add(pserson3);
		testList.add(pserson4);
		
		for (int i = 0; i < testList.size(); i++)
            System.out.println(testList.get(i));
		
		// 1. stream lamba
		/*
		List<Person> sortedList = testList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		
		List<Person> sortedList = testList.stream()
				.sorted(Comparator.comparing(Person::getAge)
						.thenComparing(Person::getName).reversed())
				.collect(Collectors.toList());
		*/   
		
		// 2. Comparator
		testList.sort(new Comparator<Person>() {
	              @Override
	              public int compare(Person arg0, Person arg1) {
	            	  // compare()의 리턴 값은 음수, 양수, 0
	            	  return arg0.getAge() - arg1.getAge();
	              }
	       });

		for (int i = 0; i < testList.size(); i++)
            System.out.println("sortedList " + testList.get(i));
		
	}

}
