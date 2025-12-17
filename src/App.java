import java.util.Stack;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
 public static void main(String[] args) {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        SignValidator signValidator = new SignValidator();

        String cadena1 = "([]){}";
        String cadena2 = "({)}";

        System.out.println("Cadena: " + cadena1 + " es válida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es válida? " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        System.out.println("Stack original: " + stack);

        StackSorter sorter = new StackSorter();
        sorter.sort(stack);

        System.out.println("Stack ordenado: " + stack);
    }

    private static void runQueuePalindrome() {
        QueueUtils queueUtils = new QueueUtils();

        String s1 = "ana";
        String s2 = "radar";
        String s3 = "java";

        System.out.println(s1 + " es palíndromo? " + queueUtils.isPalindrome(s1));
        System.out.println(s2 + " es palíndromo? " + queueUtils.isPalindrome(s2));
        System.out.println(s3 + " es palíndromo? " + queueUtils.isPalindrome(s3));
    }
}