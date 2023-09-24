package ru.kk.task7week.service;

public class Solution {
    public int[] removeDuplicates(int[] nums) {
        int addIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        for (int i = addIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
