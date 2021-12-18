package chapter4.item15;

public class Clock {

	public Clock() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 1. public 으로 변수(정보)를 선언
	 * 외부에서 변경할수있음. 예를 들어서 시간이 0~23시까지 존재하는데 유효하지않은 값을 set할수 있음
	 */
	/*
	public int time;
	public int min;
	*/
	/**
	 * 2. private 으로 변수(정보)를 선언
	 * 외부에서 못함. 변수를 변경할때, public 함수를 별도로 선언하여 사용.
	 */
	private int time;
	private int min;

	public void setTime(int time) {
		if (time < 0 || time > 23) {
			System.out.println("시간 오류입니다.");
		} else {
			this.time = time;
		}
	}

	public void setMin(int min) {
		if (min < 0 || min > 59) {
			System.out.println("분 오류입니다.");
		} else {
			this.min = min;
		}
	}

	public int getTime() {
		return time;
	}

	public int getMin() {
		return min;
	}
	
}
