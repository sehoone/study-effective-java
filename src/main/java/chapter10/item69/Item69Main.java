package chapter10.item69;

public class Item69Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 예외는 진짜 예외 상황에만 사용하라
		 * 
		 * 예외는 오직 예외 상황에서만 써야 합니다. 절대로 일상적인 제어 흐름용으로 쓰여선 안된다.
		 * 
		 * 예외는 예외 상황에 쓸 용도로 설계되었다. 그러므로 JVM 구현자 입장에서 명확한 검사만큼 빠르게 만들 동기가 약하다.
		 * 코드를 try-catch 블록에 넣으면 JVM이 적용할 수 있는 최적화가 제한된다.
		 * 배열을 순회하는 표준 관용구는 JVM이 최적화해준다.
		 * 
		 * 예외는 오적 예외 상황에서만 써야한다. 절대 일상적인 제어 흐름용으로 쓰여선 안 된다.
		 * 성능 개선을 목적으로 과하게 머리를 쓴 기법은 자제하라.
		 * 잘 설계된 API라면 클라이언트가 정상적인 제어 흐름에서 예외를 사용할 일이 없게 해야 한다.
		 */
		
		// 잘못된 예외처리. 정상동작이어도 예외처리로 처리
		String[] range = {"aa","ff","ss"};
        try {
            int i = 0;
            while (true) {
                range[i++].toLowerCase();
                System.out.println(range[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
	}
}
