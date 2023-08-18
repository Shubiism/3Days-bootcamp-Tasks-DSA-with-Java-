public class MaxDifference {
    public static int largestDifference(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two elements");
        }

        int minElement = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDifference = Math.max(maxDifference, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        int result = largestDifference(arr);
        System.out.println("Largest difference: " + result);
    }
}
