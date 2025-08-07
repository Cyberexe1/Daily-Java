public class modifyArray {

    // Static method to modify the array
    public static void modifyArray(int[] arr) {
        arr[0] = 100;  // Modify the first element
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};          // Original array
        modifyArray(nums);              // Call method to modify the array
        System.out.println(nums[0]);    // Output: 100 (changed!)
    }
}
// In this example, the array is modified in the method, demonstrating that arrays are passed by reference in Java.
// This means that changes made to the array inside the method will reflect in the original array outside the method.