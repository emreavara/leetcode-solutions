import java.util.Arrays;

public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicates(nums));
  }

  public static int removeDuplicates(int[] nums) {
    int currentIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[currentIndex]) {
        currentIndex++;
        nums[currentIndex] = nums[i];
      }
    }
    System.out.println(Arrays.toString(nums));
    return currentIndex + 1;
  }
}
