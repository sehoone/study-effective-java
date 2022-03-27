package chapter10.item77;

public class Item77Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 예외를 무시하지 말자.
		 * 
		 * 예외는 문제 상황에 대처하기 위해 존재하는데, catch블록을 비워두면 예외가 존재할 이유가 사라진다 비유하자면 화재 경보를 아예 꺼버리는 것이다.
		 * 검사 예외든 비검사 예외든 빈 catch 블록을 못 본 척 지나치면 그 프로그램은 오류를 내재한 체 동작하게 된다. 절대로 그러지 말자.
		 * 
		 */
		
		String[] range = {"aa","ff","ss"};
        try {
            int i = 0;
            while (true) {
                range[i++].toLowerCase();
                System.out.println(range[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
	}
}
