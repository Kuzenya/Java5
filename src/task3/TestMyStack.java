package task3;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 строк:");

        // Создание стека с использованием композиции
        System.out.println("\n=== MyStack: композиция ===");
        MyStack stack = new MyStack();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Строка " + i + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Исходный стек: " + stack);

        // Копирование стека
        MyStack copy = new MyStack(stack);
        copy.push("Добавлено только в копию");

        System.out.println("Копия: " + copy);
        System.out.println("Исходный после изменения копии: " + stack);

        // Создание стека с использованием наследования
        System.out.println("\n=== MyStackInherited: наследование ===");
        MyStackInherited inherited = new MyStackInherited();

        MyStackInherited inheritedCopy = new MyStackInherited();
        MyStack temp = new MyStack(stack);
        String[] strings = new String[5];
        for (int i = 4; i >= 0; i--) {
            strings[i] = (String) temp.pop();
        }

        for (String str : strings) {
            inherited.push(str);
        }

        inheritedCopy = inherited.copy();
        inheritedCopy.push("Элемент только в копии");

        System.out.println("Исходный стек: " + inherited);
        System.out.println("Копия: " + inheritedCopy);

        System.out.println("Извлечение в обратном порядке:");
        while (!inherited.isEmptyStack()) {
            System.out.println(inherited.pop());
        }

        scanner.close();
    }
}
