import java.util.Arrays;

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = {1, 2, 3};
    int[] digits2 = {8, 9, 9, 9};
    int[] digits3 = {9, 8, 9};
    int[] digits4 = {9};

    System.out.println("124 :" + Arrays.toString(plusOne(digits)));
    System.out.println("9000 :" + Arrays.toString(plusOne(digits2)));
    System.out.println("990 :" + Arrays.toString(plusOne(digits3)));
    System.out.println("10 :" + Arrays.toString(plusOne(digits4)));
  }

  public static int[] plusOne(int[] digits) {
    int digitsLastIndex = digits.length - 1;
    int carry = 1;
    for (int i = digitsLastIndex; i >= 0; i--) {
      digits[i] += carry;
      if (digits[i] == 10) {
        digits[i] = 0;
        carry = 1;
      } else {
        break;
      }
    }
    if (digits[0] == 0) {
      int[] londerDigits = new int[digitsLastIndex + 2];
      londerDigits[0] = 1;
      digits = londerDigits;
    }
    return digits;
  }
}
