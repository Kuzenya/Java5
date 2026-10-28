package task2;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {
    private E[] elements;
    private int size;


    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public void push(E item) {
        ensureCapacity();
        elements[size++] = item;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = elements[--size];
        elements[size] = null;
        return item;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    @Override
    public String toString() {
        return "Стек (снизу вверх): " + Arrays.toString(
                Arrays.copyOf(elements, size));
    }
}
