package chapter4.item16;

public class Item16Main {

	public static void main(String[] args) {
		/**
		 * public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라
		 * 객체 지향 프로그래머는 필드 들은 모두 private으로 바꾸고 public 접근자(getter)를 추가한다.
		 * public 클래스의 필드가 불변이라면 직접 노출할 때의 단점이 조금은 줄어들지만, 여전히 결코 좋은 생각이 아니다. 단, 불변식은 보장할 수 있게 된다.
		 */
		
		Time time = new Time(11,22);
		System.out.println(time.getHour());
	}

}
