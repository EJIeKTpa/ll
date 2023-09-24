package ru.kk.task7week._main;

import ru.kk.task7week.service.Solution;

import java.util.Arrays;

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

    }
}
