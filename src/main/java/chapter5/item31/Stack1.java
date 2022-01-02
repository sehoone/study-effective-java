package chapter5.item31;

import java.util.Arrays;

public class Stack1<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // Object 배열을 생성한 뒤 제네릭 배열로 형변환
    @SuppressWarnings("unchecked")
    public Stack1() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() throws Exception {
        if (size == 0)
            throw new Exception();
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
    
    //public void pushAll(Iterable<E> src) {
    //pushAll의 입력 매개변수 타입은 'E의 Iterable'이 아니라 'E의 하위 타입의 Iterable'이어야 하며, 와일드카드 타입 Iterable<? extends E>가 정확히 이런 뜻
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
        }

}
