package item8.item50;

import java.util.Date;

public class Item50Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 적시에 방어적 복사본을 만들어라
		 * 
		 * 클라이언트가 불변식을 깨뜨릴 수 있으므로, 방어적 프로그래밍을 해야한다.
		 * 
		 * 클래스가 클라이언트로부터 받은 혹은 클라이언트로 반환하는 구성요소가 가변이라면 그 요소는 반드시 방어적으로 복사해야한다.
		 * 복사 비용이 너무 크거나 클라이언트가 잘못 수정할일이 없음을 신뢰한다면 방어적 복사를 수행하는 대신 해당 구성요소를 수정했을때의 책임이 클라이언트에 있음을 명시하라
		 * 
		 */
		
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);  // Modifies internals of p!
        System.out.println(p);
	}

}
