package Arrays.solve;

import org.jetbrains.annotations.NotNull;

public class removeDuplicate {
    public int removeDuplicates(@org.jetbrains.annotations.NotNull int @NotNull [] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Index for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

