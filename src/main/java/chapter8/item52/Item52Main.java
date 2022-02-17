package chapter8.item52;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Item52Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 다중정의는 신중히 사용해라
		 *
		 * 다중성의 메서드가 어떤게 호출될지 모른다면 프로그램이 오동작하지 쉽다.
		 * 런타임에 이상하게 행동할것이며 API사용자들은 문제를 진단하느라 긴시간을 허비할것이다.
		 * 그러니 다중정의가 혼동을 일으키는 상황을 피해야한다. 안전하고 보수적으로 가려면 매게변수 수가 같은 다중정의는 말들지 말자.
		 * 
		 * 프로그래밍 언어가 다중정의를 허용한다고 해서 다중정의를 꼭 활용하라는 것은 아니다. 일반적으로 매개변수 수가 같을때는 다중정의를 피하는것이 좋다.
		 * 
		 */
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections)
            System.out.println(classify(c));
		
	}
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }
}
