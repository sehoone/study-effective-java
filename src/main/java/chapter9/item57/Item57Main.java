package chapter9.item57;

public class Item57Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 지역변수의 범위를 최소화해라
		 * 
		 * 지역 변수의 유효 범위를 최소로 줄이면 코드 가독성과 유지보수성은 높아지고 오류 가능성은 낮아진다.
		 * 
		 * 지역 변수 유효 범위 줄이는 방법
		 * 가장 처음 쓰일 때 선언하기
		 * 대부분의 지역변수는 선언과 동시에 초기화하기
		 * 반복 변수의 값을 반복문이 종료된 뒤에도 써야되는 상황이 아니라면 while문 보다 for문 사용
		 * 메서드를 작게 유지하고, 한 가지 기능에 집중하기
		 * 
		 */
		
	}
//	 Iterator<Element> i = c.iterator();
//	 while(i.hasNext()){
//	   doSomething(i.next());
//	 }
//
//	 Iterator<Element> i2 = c2.iterator();
//	 while(i.hasNext()){ // bug 위에서 선언한 i 사용
//	   doSomething(i2.next());
//	 }
	
//	 for(Iterator<Element> i = c.iterator(); i.hasNext();) {
//		  Element e = i.next();
//	 }
//
//	 for(Iterator<Element> i2 = c2.iterator(); i.hasNext();) { // i를 찾을 수 없다는 컴파일 오류 발생
//		  Element e = i2.next();
//  }  
}
