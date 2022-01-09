package chapter5.item33;

public class Item33Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 타입 안전 이종 컨테이너를 고려하라
		 * 제네릭은 Set<E>, Map<K,V> 등의 컬렉션과 ThreadLocal<T>, AtomicReference<T> 등의 단일 원소 컨테이너에도 흔히 쓰인다. 
		 * 예컨대 Set에는 원소의 타입을 뜻하는 단 하나의 타입 매개변수만 있으면 되며, Map에는 키와 값의 타입을 뜻하는 2개만 필요한 식이다.
		 * 더 유연한 수단이 필요할 때도 종종 있다
		 * 
		 * 컬렉션 API로 대표되는 일반적인 제네릭 형태에서는 한 컨테이너가 다룰 수 있는 타입 매개변수의 수가 고정되어 있다. 
		 * 하지만 컨테이너 자체가 아닌 키를 타입 매개변수로 바꾸면 이런 제약이 없는 타입 안전 이종 컨테이너를 만들 수 있다. 
		 * 타입 안전 이종 컨테이너는 Class를 키로 쓰며, 이런 식으로 쓰이는 Class 객체를 타입 토큰이라 한다.
		 * 
		 */
		
		Favorites f = new Favorites();
		
		f.putFavorite(String.class, "Java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);

		String favoriteString = f.getFavorite(String.class);
		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);

		System.out.println(favoriteString);
		System.out.println(favoriteInteger);
		System.out.println(favoriteClass.getName());
		
		
	}
	
}
