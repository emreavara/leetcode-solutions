public class AddBinary {

  public static void main(String[] args) {
    String a = "11";
    String b = "1";

    String a1 = "1010";
    String b1 = "1011";

    String a2 = "110010";
    String b2 = "10111";

    System.out.println("100 : " + addBinary(a, b));
    System.out.println("10101 : " + addBinary(a1, b1));
    System.out.println("1001001 : " + addBinary(a2, b2));
  }

  public static String addBinary(String a, String b) {
    String longerBinary = a;
    String shorterBinary = b;
    if (b.length() > a.length()) {
      longerBinary = b;
      shorterBinary = a;
    }
    int longerBinaryLength = longerBinary.length();
    StringBuilder result = new StringBuilder();

    int lastIndexA = longerBinaryLength - 1;
    int carry = 0;
    int shift = longerBinaryLength - shorterBinary.length();
    char charToAdd;
    for (int i = lastIndexA; i >= 0; i--) {

      if (i >= shift) {
        charToAdd = shorterBinary.charAt(i - shift);
      } else {
        charToAdd = (char) (carry + '0');
        carry = 0;
      }
      if (longerBinary.charAt(i) == charToAdd) {
        result.append(carry);
        carry = longerBinary.charAt(i) - 48;
      } else {
        result.append(carry == 1 ? 0 : 1);
      }
    }
    if (carry == 1) {
      result.append(carry);
    }
    return result.reverse().toString();
  }

}
