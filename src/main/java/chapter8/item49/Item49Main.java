package chapter8.item49;

import java.util.Objects;

public class Item49Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 매개변수가 유효한지 검사해라
		 * 
		 * 메서드와 생성자 대부분이 입력 매개변수의 값이 특정 조건을 만족하기를 바란다. 
		 * 이러한 제약은 메서드 로직이 실행되기 전, 즉, 메서드 도입 부분에서 매개변수를 확인해 잘못된 값이 넘어온 경우 바로 깔끔하게 예외처리를 할 수 있다.
		 * 
		 * 메서드나 생성자를 작성할때면 그 매개변수들에 어떤제약이 있을지 생각해야 한다. 그 제약들을 문서화하고 메서드 코드 시작부분에서 명시적으로 검사해야한다.
		 * 이런 습관을 반드기 기르도록 하자. 그 노력은 유효성 검사가 실제 오류를 처음 걸래낼때 충분히 보상받을 것이다.
		 */
		
		int num1 = 110;
		int num2 = 3;
		
		int result = plus(num1, num2);
				
		System.out.println(result);
	}

    /**
     * 두수의 합을 구함
     *
     * @param originNum 기준숫자
     * @param plusNum 더할숫자
     * @return 두수의 합
     * @throws NullPointerException 필수값이 null이면 발생
     * @throws ArithmeticException m이 0 이하이면 발생
     */
    public static Integer plus(Integer originNum, Integer plusNum) {
    	// null체크. java7부터 사용자능
    	Objects.requireNonNull(originNum, "originNum 필수값 없음");
    	Objects.requireNonNull(plusNum, "plusNum 필수값 없음");
    	
    	// java9 부터는 objects에 아래의 범위체크 메서드가 추가됨.
    	/*
    	Objects.checkFromIndexSize(fromIndex, size, length);
    	Objects.checkFromToIndex(fromIndex, toIndex, length);
    	Objects.checkIndex(index, length)
    	*/
    	if (plusNum <= 0) {
            throw new ArithmeticException("계수(plusNum)는 양수여야 합니다. " + plusNum);
        }
    	
    	originNum = originNum + plusNum;
        
        return originNum;
    }
    
}
