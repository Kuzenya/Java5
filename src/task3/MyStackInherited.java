package task3;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStackInherited extends ArrayList<Object> {
    public boolean isEmptyStack() {
        return isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return get(size() - 1);
    }

    public void push(Object item) {
        add(item);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return remove(size() - 1);
    }


    public MyStackInherited copy() {
        MyStackInherited copy = new MyStackInherited();
        copy.addAll(this);
        return copy;
    }
}
