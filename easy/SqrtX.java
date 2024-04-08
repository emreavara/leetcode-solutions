public class SqrtX {

  private static int MAX_VAL = 65535;
  private int MID_VAL = MAX_VAL / 2;

  public static void main(String[] args) {

    int number1 = 4;
    int number2 = 8;
    int number3 = 16;
    int number4 = 2147483647;

    System.out.println("2 :" + mySqrt(number1));
    System.out.println("2 :" + mySqrt(number2));
    System.out.println("4 :" + mySqrt(number3));
    System.out.println("4 :" + mySqrt(number4));
  }

  public static int mySqrt(int x) {
    if (x == 0 || x == 1) {
      return x;
    }
    long mid = x / 2;
    long low = 1;
    long high = x;
    long result = -1;
    while (low <= high) {
      result = mid * mid;
      if (result <= x && (mid + 1) * (mid + 1) > x) {
        return (int) mid;
      }
      if (result > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
      mid = (int) (low + (high - low) / 2);
    }
    return (int) mid;
  }
}
