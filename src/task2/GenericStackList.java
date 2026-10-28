package task2;

import java.util.ArrayList;
import java.util.EmptyStackException;

// Стек через наследование от ArrayList.
public class GenericStackList<E> extends ArrayList<E> {
    public int getSize() {
        return size();
    }

    public boolean isEmptyStack() {
        return isEmpty();
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return get(size() - 1);
    }

    public void push(E item) {
        add(item);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return remove(size() - 1);
    }
}
