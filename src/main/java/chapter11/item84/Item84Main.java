package chapter11.item84;

public class Item84Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 프로그램의 동작을 스레드 스케줄러에 기대하지 말라
		 * 
		 * 여러 스레드가 실행 중이면 운영체제의 스레드 스케줄러가 어떤 스레드를 얼마나 오래 실행할지 정한다.
		 * 
		 * 프로그램의 동작을 스레스 스케줄러에 기대지 말자. 견고성과 이식성을 모두 해치는 행위다.
		 * 같은 이유로 thread.yield와 스레드 우선순위에 의존해서도 안된다.
		 * 이 기능들은 스레드 스케줄러에 제공하는 힌트일 뿐이다. 스레드 우선순위는 이미 잘 동작하는 프로그램의 서비스 품질을 높이기위해
		 * 드물게 쓰일 수는 있지만 간신히 동작하는 프로그램을 고치는 용도로 사용해서는 절대 안된다.
		 */
		
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread Running1");
			}
		};
		thread.setPriority(2);
		
		Thread thread2 = new Thread() {
			public void run() {
				System.out.println("Thread Running2");
			}
		};
		thread2.setPriority(1);
		
		thread.start();
		thread2.start();
		//Thread.yield();
	}
	
}
