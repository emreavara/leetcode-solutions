public class IntegetToRoman {

  private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  private static final String[] romanChars =
      {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public static void main(String[] args) {
    int num = 400;
    System.out.println(intToRoman(num));
  }

  public static String intToRoman(int num) {

    StringBuilder roman = new StringBuilder();
    byte index = 0;
    while (num > 0) {
      if (num < numbers[index]) {
        index++;
      } else {
        roman.append(romanChars[index]);
        num -= numbers[index];
      }
    }
    return roman.toString();
  }
}
