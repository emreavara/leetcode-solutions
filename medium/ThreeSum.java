import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

  public static void main(String[] args) {
    int[] nums = {3, 0, -2, -1, 1, 2};
    System.out.println(threeSum(nums));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> addedList = new HashSet<>();
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> newItem = List.of(nums[i], nums[j], nums[k]);
            List<Integer> sortedNewItem = newItem.stream().sorted().collect(Collectors.toList());
            if (!addedList.contains(sortedNewItem)) {
              addedList.add(sortedNewItem);
              result.add(newItem);
            }
          }
        }
      }
    }
    return result;
  }
}
