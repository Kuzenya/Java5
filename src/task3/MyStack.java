package task3;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
    private final ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public MyStack(MyStack other) {
        list = new ArrayList<>(other.list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object item) {
        list.add(item);
    }

    @Override
    public String toString() {
        return "Стек (снизу вверх): " + list;
    }
}
