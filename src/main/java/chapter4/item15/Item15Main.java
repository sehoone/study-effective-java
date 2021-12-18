package chapter4.item15;

public class Item15Main {

	public static void main(String[] args) {
		/**
		 * 클래스와 멤버의 접근 권한을 최소화하라
		 * 모든 클래스와 멤버의 접근성을 가능한 한 좁혀야 한다(정보은닉)
		 * 시스템 개발 속도를 높임(여러 컴포넌트를 병렬로 개발가능)
		 * 시스템 관리 비용을 낮춤(각 컴포넌트를 더 빨리 파악하여 디버깅할 수 있고, 다른 컴포넌트로 교체하는 부담적음)
		 * 소프트웨어 재사용성을 높임
		 */
		
		Clock clock = new Clock();
		clock.setMin(66);
	}

}
