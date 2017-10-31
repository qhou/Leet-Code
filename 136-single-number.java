/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

import java.util.Hashtable; 
import java.util.*;
import java.util.List;
import java.util.Arrays; 
//input #1:[1, 1, 2, 2, 3, 4, 4]
//output 3

//input #2:[1, 2, 2, 3, 3, 4, 4]
//output 1

class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        int i = 0;
        
        if (length == 1)
            return nums[0];
        
        while (i < length-1){ //length - 1 is the last index of nums
            if (nums[i] != nums[i+1]){
                    return nums[i];
            }
            if (nums[i] == nums[i+1]){
                     i += 2; 
            }
            
        }
        return nums[length-1];
        
    }
}