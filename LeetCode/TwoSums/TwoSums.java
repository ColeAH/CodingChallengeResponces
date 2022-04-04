class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> entryHashed = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            entryHashed.put(i, nums[i]);
        }
        outermost: for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (entryHashed.get(i) + entryHashed.get(j) == target && i != j) {
                    output[0] = j;
                    output[1] = i;
                    break outermost;
                }
            }
        }
        return (output);
    }
}