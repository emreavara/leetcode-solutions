public class IsSubsequence {

  public static void main(String[] args) {

    String s = "abc";
    String t = "ahbgdc";

    System.out.println("Result : " + isSubsequence(s, t));
  }

  public static boolean isSubsequence(String s, String t) {
    int sLength = s.length();
    int tLength = t.length();

    if (sLength == 0) {
      return true;
    }

    if (tLength == 0) {
      return false;
    }

    int sIndex = 0;

    for (int i = 0; i <= tLength - 1; i++) {
      if (t.charAt(i) == s.charAt(sIndex)) {
        sIndex++;
      }
      if (sIndex == sLength) {
        return true;
      }
    }
    return false;
  }
}
