package com.uk.sprint.rest.utility;

import java.util.*;

public class SubsequenceArray {

    /* Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
       A subsequence is an array that can be derived from another array by deleting
       some or no elements without changing the order of the remaining elements.
       A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
    */
    public int longestArithSeqLength(int[] nums) {
        Map<Integer, HashSet<Integer>> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) { // [3,6,9,12] [9,4,7,2,10]
                int k = nums[j] - nums[i];
                if (resultMap.containsKey(k)) {
                    resultMap.get(k).add(nums[i]);
                    resultMap.get(k).add(nums[j]);
                } else {
                    HashSet<Integer> newList = new HashSet<>();
                    newList.add(nums[i]);
                    newList.add(nums[j]);
                    resultMap.put(k, newList);
                }
            }
        }

        int result = 0;
        for (Set v : resultMap.values()) {
            if (v.size() > result) {
                result = v.size();
            }
        }
        return result;
    }
}
