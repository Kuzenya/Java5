package task3;

public class TestMyStack {
    public static void main(String[] args) {
        System.out.println("=== MyStack: композиция ===");
        MyStack stack = new MyStack();
        for (int i = 1; i <= 5; i++) {
            stack.push("Строка " + i);
        }
        System.out.println("Исходный стек: " + stack);

        MyStack copy = new MyStack(stack);
        copy.push("Добавлено только в копию");
        System.out.println("Копия:         " + copy);
        System.out.println("Исходный после изменения копии: " + stack);

        System.out.println("\n=== MyStackInherited: наследование ===");
        MyStackInherited inherited = new MyStackInherited();
        for (int i = 1; i <= 5; i++) {
            inherited.push("Элемент " + i);
        }
        MyStackInherited inheritedCopy = inherited.copy();
        inheritedCopy.push("Элемент только в копии");

        System.out.println("Исходный стек: " + inherited);
        System.out.println("Копия: " + inheritedCopy);
        System.out.println("Извлечение в обратном порядке:");
        while (!inherited.isEmptyStack()) {
            System.out.println(inherited.pop());
        }
    }
}
