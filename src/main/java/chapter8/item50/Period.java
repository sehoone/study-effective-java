package chapter8.item50;

import java.util.Date;

// Broken "immutable" time period class (Pages 302-1)
public final class Period {
	private final Date start;
	private final Date end;

	/**
	 * @param start the beginning of the period
	 * @param end   the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException     if start or end is null
	 */

//    public Period(Date start, Date end) {
//        if (start.compareTo(end) > 0)
//            throw new IllegalArgumentException(
//                    start + " after " + end);
//        this.start = start;
//        this.end   = end;
//    }
	// 매개변수를 방어적 복사본을 만든다
	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());

		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(this.start + " after " + this.end);
	}

	public Date start() {
		return start;
	}

	public Date end() {
		return end;
	}

	public String toString() {
		return start + " - " + end;
	}

}