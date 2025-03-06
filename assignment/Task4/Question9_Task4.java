package com.assignment.Task4;

import java.util.*;

public class Question9_Task4 {
    public static void main(String args[])throws Exception {
        int[] nums = {1, 4, 10, -3};
        int target = 14;

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        if (result[0] != -1) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
