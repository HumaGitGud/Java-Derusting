import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    int[] nums = new int[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    for (int i = 0; i < nums.length; i++) {
      nums[i] = i+1;
    }
    System.out.println(Arrays.toString(nums));

    // Get the value of the array at index 2
    System.out.println(nums[2]);

    // Get the length of the array
    System.out.println(nums.length);
    System.out.println();
    
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    System.out.println();

    // Iterate over the array using a for-each loop and print out each item
    for (int i : nums) {
      System.out.println(i);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
