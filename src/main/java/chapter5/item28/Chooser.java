package chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// List-based Chooser - typesafe (Page 129)
public class Chooser<T> {
	  private final Object[] choiceArray;

	  public Chooser(Collection choices) { // 로타입을 썼다.
	    choiceArray = choices.toArray();
	  }

	  public Object choose() {
	    Random rnd = ThreadLocalRandom.current();
	    return choiceArray[rnd.nextInt(choiceArray.length)]; // 여기서 형변환 오류가 날 수 있다.
	  }
	  
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        Chooser<Integer> chooser = new Chooser<>(intList);

        for (int i = 0; i < 10; i++) {
            Number choice = (Number) chooser.choose();
            System.out.println(choice);
        }
    }
}
