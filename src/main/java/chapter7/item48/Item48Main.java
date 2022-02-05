package chapter7.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Item48Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 스트림 병렬화는 주의해서 사용해라
		 * 
		 * 스트림을 잘못 병렬화하면 성능이 나빠질 뿐만 아니라 결과 자체가 잘못되거나 예상 못한 동작(safety failure)이 발생할 수 있다.
		 * 예를들어, Stream reduce 연산의 accumulator와 combiner 함수는 반드시 결합 법칙을 만족하고, 간섭받지 않고, 상태를 갖지 않아야한다.
		 * 위 조건을 다 만족하더라도, 병렬화에 드는 추가 비용을 상쇄하지 못한다면, 성능 향상이 미미할 수 있음.
		 * 계산이 정확하고, 확실히 성능이 좋아졌을 경우에만 병렬화를 실 운영에 적용해야한다.
		 * 조건이 잘 갖춰지면, parallel 메서드 호출 하나로 프로세서 코어 수에 비례하는 성능 향상을 만끽할 수 있다.
		 */
		System.out.println(pi(10_000_000));
	}

    static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
}
