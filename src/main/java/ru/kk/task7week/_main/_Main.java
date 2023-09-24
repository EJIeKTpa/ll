package ru.kk.task7week._main;

import ru.kk.task7week.service.Solution;

import java.util.Arrays;
import java.util.Map;

import static ru.kk.task7week.service.BracketValidation.isValid;

public class _Main {
    public static void main(String[] args) {
//1
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        Solution solution = new Solution();
        int[] result = solution.removeDuplicates(nums);
        System.out.println(Arrays.equals(result, expectedNums));
//2
        String[] testCases = {"()", "()[]{}", "(]", "([)]"};
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isValid(testCase));
        }
//3
        String str = "hello world";
        Map<Character, Integer> charCount = countCharacters(str);

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println(character + " - " + count);
        }
    }
}
