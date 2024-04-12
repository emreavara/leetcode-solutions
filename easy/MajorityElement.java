import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  public static void main(String[] args) {
    int[] prices = {2, 2, 1, 1, 1, 2, 2};

    System.out.println("Majority Element : " + majorityElement(prices));
  }

  public static int majorityElement(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();
    for (int num : nums) {
      numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
    }
    return Collections.max(numsMap.entrySet(), Map.Entry.comparingByValue()).getKey();
  }

}
