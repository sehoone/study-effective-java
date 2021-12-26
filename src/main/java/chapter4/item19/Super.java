package chapter4.item19;

public class Super {
    public Super() {
    	// 상속클래스 생성자는 재정의 가능 메서드를 호출하면 안된다
        //overrideMe();
    }

    /**
     * {@inheritDoc}
     *
     * <p>이것을 사용하려면 이렇게 써야해
     *
     * <p>Note that this implementation throws an
     * <tt>UnsupportedOperationException</tt> if the iterator returned by this
     * collection's iterator method does not implement the <tt>remove</tt>
     * method and this collection contains the specified object.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     */
    public void overrideMe() {
    }
}
