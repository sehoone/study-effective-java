package chapter8.item53;

public class Item53Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 가변인수는 신중히 사용해라
		 *
		 * 가변인수(varargs) 메서드는 명시한 타입의 인수를 0개 이상 받을 수 있다. 가변인수 메서드 호출시, 가장 먼저 인수의 개수와 길이가 같은 배열을 만들고, 인수들을 배열에 저장해 가변인수 메서드에 넘겨준다.
		 * 
		 * 가변인수는 인수 개수가 정해지지 않았을 때 아주 유용하다.
		 * 하지만, 가변인수 메서드는 호출될 때마다 배열을 새로 하나 할당하고 초기화 하므로, 성능에 민감한 상황에서는 걸림돌이 될 수 있다. 비용을 감당할 수 없지만, 가변인수의 유연성이 필요한 경우 다중정의를 통해 해결할 수 있다.
		 * 
		 */
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(min(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
	}
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }
    
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }

}
