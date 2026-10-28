package task2;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");
        stack.push("Четвёртый");
        stack.push("Пятый");

        System.out.println("Исходный " + stack);
        System.out.println("Элементы в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        GenericStackList<String> inheritedStack = new GenericStackList<>();
        inheritedStack.push("A");
        inheritedStack.push("B");
        inheritedStack.push("C");
        System.out.println("Стек на основе ArrayList:");
        while (!inheritedStack.isEmptyStack()) {
            System.out.println(inheritedStack.pop());
        }
    }
}
