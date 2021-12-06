package chapter2.item6;


public class Sum {
    private static long sum() {
    	/** 1. Long 클래스를 생성 **/
        //Long sum = 0L;
    	/** 2. long type를 사용 **/
    	long sum = 0L;
    	
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt("20");
        long x = 0;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }
        System.out.println(x);
    }
}