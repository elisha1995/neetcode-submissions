class Solution {
    public int[] replaceElements(int[] arr) {
       

        int lastValueIndex = arr.length - 1;
        int maxRight = arr[lastValueIndex];

        for (int i = lastValueIndex - 1; i >= 0; i--) {

            int currentValue = arr[i];

            arr[i] = maxRight;

            maxRight = Math.max(maxRight, currentValue);
        }

        arr[lastValueIndex] = -1;

        return arr;
    }
}