package LettersPermutations;

public class Main {
    public static void main(String[] args) {
        /**
         * Letters permutations by Charles Henry M. Tinoy Jr.
         *
         * Huhu algorithm nani sya so please refer lang ari:
         * https://www.geeksforgeeks.org/java/java-program-to-print-all-permutations-of-a-given-string
         *
         * Recursion tree nga akoang gi sunod:
         * https://media.geeksforgeeks.org/wp-content/cdn-uploads/NewPermutation.gif
         */

        System.out.println("==============================");
        System.out.println("Letters permutations by Charles Henry M. Tinoy Jr.");
        System.out.println("Program 17. on page 125 (Basic Elements of Java)");
        System.out.println("==============================");

        char[] objects = {'a', 'b', 'c'};

        System.out.println("Objects: " + new String(objects));
        System.out.println("==============================");
        System.out.println("Permutations:");
        permutate(objects, 0, objects.length - 1);
    }

    private static void permutate(char[] objects, int left, int right) {
        if (left == right) {
            System.out.println(new String(objects));
        } else {
            for (int i = left; i <= right; i++) {
                swapLetters(objects, left, i);
                permutate(objects, left + 1, right);
                swapLetters(objects, left, i);
            }
        }
    }

    private static void swapLetters(char[] objects, int left, int right) {
        char temp = objects[left];
        objects[left] = objects[right];
        objects[right] = temp;
    }
}
