package Array;

public class Dmo {
    public static int binarySearchInfinite(int[] arr, int target) {
        int low = 0;
        int high = 1;


        // Increase the high index exponentially until the target is out of the range
        try {
            while (arr[high] < target) {
                low = high;
                high *= 2;
            }
        }
        catch ( ArrayIndexOutOfBoundsException e){
            return -1;
        }

        // Perform a standard binary search within the determined range
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;  // Element found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        // Example usage:
        // Assume you have an infinite sorted array (for simplicity, we'll create an array with a limited number of elements)
        int[] infiniteArray = {1, 2, 3, 5, 6, 7, 8, 10};
        int targetElement = 10;

        int result = binarySearchInfinite(infiniteArray, targetElement);
        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
