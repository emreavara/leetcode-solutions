public class ContainerWithMostWater {

  public static void main(String[] args) {
    int[] height = {1, 1};
    System.out.println(maxArea(height));
  }

  public static int maxArea(int[] height) {
    int maximumArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int currentArea = (right - left) * Math.min(height[left], height[right]);
      maximumArea = Math.max(currentArea, maximumArea);
      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return maximumArea;
  }
}
