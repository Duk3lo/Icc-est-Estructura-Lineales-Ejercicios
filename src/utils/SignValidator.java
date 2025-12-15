package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String signos) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < signos.length(); i++) {
            char c = signos.charAt(i);

            if (open(c)) {
                pila.push(c);
            } else if (close(c)) {
                if (pila.isEmpty())
                    return false;

                char ultimo = pila.pop();
                if (!correctSyntax(ultimo, c)) {
                    return false;
                }
            }

        }
        return pila.isEmpty();
    }

    private static boolean open(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean close(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean correctSyntax(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
