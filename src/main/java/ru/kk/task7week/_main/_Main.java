package ru.kk.task7week._main;

import ru.kk.task7week.service.Solution;

import java.util.Arrays;
import java.util.LinkedList;

import static ru.kk.task7week.service.BracketValidation.isValid;
import static ru.kk.task7week.service.CharacterCount.countCharacters;
import static ru.kk.task7week.service.LinkedListRemover.removeEven;

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
        countCharacters(str);
//4
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        removeEven(list);
        System.out.println(list);
    }
}
