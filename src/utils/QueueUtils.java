package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String text) {
        Queue<Character> original = new LinkedList<>();
        Queue<Character> inverted = new LinkedList<>();
        Queue<Character> aux = new LinkedList<>();

        for (char c : text.toCharArray()) {
            original.add(c);
            aux.add(c);
        }

        while (!aux.isEmpty()) {
            char c = aux.remove();
            Queue<Character> temp = new LinkedList<>();

            while (!aux.isEmpty()) {
                temp.add(aux.remove());
            }

            inverted.add(c);
            aux = temp;
        }

        while (!original.isEmpty()) {
            if (!original.remove().equals(inverted.remove())) {
                return false;
            }
        }
        return true;
    }
}
