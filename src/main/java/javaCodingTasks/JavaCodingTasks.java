package javaCodingTasks;

import java.util.HashSet;
import java.util.Set;

public class JavaCodingTasks {
    public static void main(String[] args) {

        //Task 1: Reverse a String Manually
        System.out.println(reverse("hello")); // "olleh"

        //Task 2: Check if a String is a Palindrome
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false

        //Task 3: Find Duplicates in an Integer Array
        int[] nums = {1, 2, 3, 2, 4, 5, 1, 6};
        findDuplicates(nums); // Output: Duplicates: [1, 2]

    }

    //Task 1: Reverse a String Manually
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    //Task 2: Check if a String is a Palindrome
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Task 3: Find Duplicates in an Integer Array
    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }


}
