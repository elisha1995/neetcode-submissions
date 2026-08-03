class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = - 1;
            return arr;
        }

        int lastValueIndex = arr.length - 1;

        for (int i = 0; i < lastValueIndex; i++) {

            int[] rightSubArray = Arrays.copyOfRange(arr, i + 1, arr.length);
            int maxToRight = Arrays.stream(rightSubArray).max().getAsInt();

            arr[i] = maxToRight;
        }

        arr[lastValueIndex] = -1;

        return arr;
    }
}