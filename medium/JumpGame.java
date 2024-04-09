public class JumpGame {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 0, 4};
    int[] nums2 = {2, 3, 1, 1, 4};
    System.out.println(canJump(nums));
    System.out.println(canJump(nums2));
  }

  public static boolean canJump(int[] nums) {
    int lastIndex = nums.length - 1;
    int currentIndex = lastIndex;
    for (int i = lastIndex; i >= 0; i--) {
      if (currentIndex - i <= nums[i]) {
        currentIndex = i;
      }
    }
    return currentIndex == 0;
  }

}
