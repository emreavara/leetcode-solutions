public class FirstOccurrenceInString {

  public static void main(String[] args) {
    String s1 = "sadbutsad";
    String s2 = "leetcode";
    String s3 = "hello";
    String s4 = "mississippi";

    System.out.println(strStr(s1, "sad"));
    System.out.println(strStr(s2, "leeto"));
    System.out.println(strStr(s3, "ll"));
    System.out.println(strStr(s4, "issipi"));
  }

  public static int strStr(String haystack, String needle) {
    // return haystack.indexOf(needle);
    int needleLength = needle.length();
    if (haystack.length() < needleLength || haystack.isEmpty()) {
      return -1;
    }
    if (needle.isEmpty()) {
      return 0;
    }
    int right;
    int left = 0;
    while (left + needleLength <= haystack.length()) {
      if (haystack.charAt(left) == needle.charAt(0)) {
        for (right = 1; right < needleLength; right++) {
          if (haystack.charAt(left + right) != needle.charAt(right)) {
            break;
          }
        }
        if (right == needleLength) {
          return left;
        }
      }
      left++;
    }
    return -1;
  }
}
