package chapter3.item14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Item14Main {

	public static void main(String[] args) {
		/**
		 * Comparable을 구현할지 고려하라
		 * compareTo는 단순 동치성 비교에 더해 순서까지 비교할 수 있으며 제내릭하다. Comparable을 구현했다는 것은 그 클래스의 인스턴스들에는 자연적인 순서가 있음을 뜻한다.
		 * Comparable을 구현한 클래스를 확장해 값 컴포넌트를 추가하고 싶다면, 확장하는 대신 독립된 클래스를 만들고, 이 클래스에 원래 클래스의 인스턴스를 가리키는 필드를 두자.
		 * 
		 * Comparable과 달리 Comparator는 우리가 비교하는 요소 유형의 외부에 있습니다. 우리는 다른 멤버로 비교하기 위해 여러 개의 개별 클래스(Comparator를 구현하는)를 만듭니다.
		 * person 클래스에 영향이 없게 외부에서만 비교를 할때는 Comparator를 사용
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
		//List<Person> sortedList = testList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		List<Person> sortedList = testList.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed()
						.thenComparing(Person::getName))
				.collect(Collectors.toList());
		
		for (int i = 0; i < sortedList.size(); i++)
            System.out.println("sortedList " + sortedList.get(i));
		
		// 2. Comparator
		/*
		testList.sort(new Comparator<Person>() {
	              @Override
	              public int compare(Person arg0, Person arg1) {
	            	  // compare()의 리턴 값은 음수, 양수, 0
	            	  return arg0.getAge() - arg1.getAge();
	              }
	       });
	       for (int i = 0; i < testList.size(); i++)
            System.out.println("sortedList " + testList.get(i));
            */

		// 3. Comparable
		/*
		Person2 pserson11 = new Person2();
		pserson11.setAge(33);
		
		Person2 pserson22 = new Person2();
		pserson22.setAge(10);
		
		Person2 pserson33 = new Person2();
		pserson33.setAge(40);
		
		Person2 pserson44 = new Person2();
		pserson44.setAge(20);
		List<Person2> testList2 = new ArrayList<Person2>();
		testList2.add(pserson11);
		testList2.add(pserson22);
		testList2.add(pserson33);
		testList2.add(pserson44);
		
		Collections.sort(testList2);
		for (int i = 0; i < testList2.size(); i++)
            System.out.println("sortedList " + testList2.get(i));
		*/
		
		System.out.println(new BigDecimal("1.0").compareTo(new BigDecimal("1.00")));
		System.out.println(new BigDecimal("1.00"));
	}

}
