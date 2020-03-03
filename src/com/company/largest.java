package com.company;

public class largest {
    public static int main(String[] args) {

        int[] nums = {4, 58, 6, 79, 11};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]> max){
                max = nums[i];
            }
        }
        return max;
    }
}
