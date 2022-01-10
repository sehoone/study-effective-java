package chapter6.item34;

public enum Operation {
	// 상수별 메서드 구현
    PLUS {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS {
        public double apply(double x, double y) { return x - y; }
    };
	
    public abstract double apply(double x, double y);
}