package chapter7.item45;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Item45Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 스트림은 주의해서 사용해라
		 * 
		 * 스트림 : 데이터 원소의 유한/무한 시퀀스를 뜻함
		 * 스트림 파이프라인 : 원소들로 수행하는 연산 단계를 표현
		 * 
		 * 스트림을 사용하지 좋은 경우.
		 * 원소들의 시퀀스를 일관되게 변환
		 * 원소들의 시퀀스를 필터링
		 * 원소들의 시퀀스를 하나의 연산을 사용하여 결합(더하기, 최솟값 구하기 등)
		 * 원소들의 시퀀스를 컬렉션에 모으는 경우
		 * 원소들의 시퀀스에서 특정 조건을 만족하는 원소를 찾는 경우
		 * 
		 * 스트림으로 바꾸는게 가능하더라도 코드 가독성과 유지보수 측면에서 손해볼 수 있기때문에 기존 코드는 스트림을 사용하도록 리팩터링하되, 새 코드가 더 나아 보일때만 반영해야한다.
		 * 즉, 스트림과 반복 중 어느쪽이 나은지 확신하기 어렵다면, 둘다 구현해보고 더 나은 쪽을 정하는 것을 권장한다.
		 * 
		 */
        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
        .filter(mersenne -> mersenne.isProbablePrime(50))
        .limit(20)
        .forEach(mp -> System.out.println(mp.bitLength() + ": " + mp));
	}
	
    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
	
}
