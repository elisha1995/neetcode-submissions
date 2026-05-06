class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueItems = new HashSet<>();

        for (int num : nums) {
            boolean isAdded = uniqueItems.add(num);

            if (!isAdded) {
                return true;
            }
        }

        return false;
    }
}