import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public static void main(String[] args) {
    int[] nums = {3, 0, -2, -1, 1, 2};
    int[] nums2 = {-2, 0, 1, 1, 2};
    int[] nums3 = {-1, 0, 1, 2, -1, -4};
    int[] nums4 = {0, 1, 1};
    System.out.println(threeSum(nums));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    int baseIndex = 0;
    int listLength = nums.length;
    while (baseIndex < listLength - 2) {
      int searchedSum = nums[baseIndex] * -1;
      int left = baseIndex + 1;
      int right = listLength - 1;

      while (left < right && (baseIndex == 0 || nums[baseIndex] != nums[baseIndex - 1])) {
        int tempSum = nums[left] + nums[right];
        if (tempSum == searchedSum) {
          result.add(List.of(nums[baseIndex], nums[left], nums[right]));
        }
        if (tempSum < searchedSum) {
          left++;
          continue;
        }
        if (tempSum > searchedSum) {
          right--;
          continue;
        }
        left++;
        right--;
        while (left < right && nums[right] == nums[right + 1]) {
          right--;
        }
      }
      baseIndex++;
    }
    return result;
  }
}
