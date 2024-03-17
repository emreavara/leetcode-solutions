public class SearchInsertPosition {

  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 6};
    int target = 2;
    System.out.println(searchInsert(nums, target));
  }

  public static int searchInsert(int[] nums, int target) {
    short left = 0;
    short right = (short) (nums.length - 1);

    while (left <= right) {
      short mid = (short) (left + ((right - left) / 2));
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = (short) (mid + 1);
      } else {
        right = (short) (mid - 1);
      }
    }

    return left;
  }
}
