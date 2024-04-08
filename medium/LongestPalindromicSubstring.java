public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    String s1 = "babad";
    String s2 = "cbbd";
    String s3 = "ac";
    String s4 = "a";
    String s5 =
        "mqizdjrfqtmcsruvvlhdgzfrmxgmmbguroxcbhalzggxhzwfznfkrdwsvzhieqvsrbyedqxwmnvovvnesphgddoikfwuujrhxwcrbttfbmlayrlmpromlzwzrkjkzdvdkpqtbzszrngczvgspzpfnvwuifzjdrmwfadophxscxtbavrhfkadhxrmvlmofbzqshqxazzwjextdpuszwgrxirmmlqitjjpijptmqfbggkwaolpbdglmsvlwdummsrdyjhmgrasrblpjsrpkkgknsucsshjuxunqiouzrdwwooxclutkrujpfebjpoodvhknayilcxjrvnykfjhvsikjabsdnvgguoiyldshbsmsrrlwmkfmyjbbsylhrusubcglaemnurpuvlyyknbqelmkkyamrcmjbncpafchacckhymtasylyfjuribqxsekbjkgzrvzjmjkquxfwopsbjudggnfbuyyfizefgxamocxjgkwxidkgursrcsjwwyeiymoafgyjlhtcdkgrikzzlenqgtdukivvdsalepyvehaklejxxmmoycrtsvzugudwirgywvsxqapxyjedbdhvkkvrxxsgifcldkspgdnjnnzfalaslwqfylmzvbxuscatomnmgarkvuccblpoktlpnazyeazhfucmfpalbujhzbykdgcirnqivdwxnnuznrwdjslwdwgpvjehqcbtjljnxsebtqujhmteknbinrloregnphwhnfidfsqdtaexencwzszlpmxjicoduejjomqzsmrgdgvlrfcrbyfutidkryspmoyzlgfltclmhaeebfbunrwqytzhuxghxkfwtjrfyxavcjwnvbaydjnarrhiyjavlmfsstewtxrcifcllnugldnfyswnsewqwnvbgtatccfeqyjgqbnufwttaokibyrldhoniwqsflvlwnjmffoirzmoxqxunkuepj";
    System.out.println("bab or aba :" + longestPalindrome(s1));
    System.out.println("bb :" + longestPalindrome(s2));
    System.out.println("a :" + longestPalindrome(s3));
    System.out.println("a :" + longestPalindrome(s4));
    System.out.println("vkkv :" + longestPalindrome(s5));
  }

  public static String longestPalindrome(String s) {
    int stringLength = s.length();
    int left;
    int right;
    String result = "";
    if (s.length() <= 1) {
      return s;
    }
    for (left = 0; left < stringLength - 1; left++) {
      right = stringLength;
      while (left <= right) {
        String currentWindow = s.substring(left, right);
        if (s.charAt(left) == s.charAt(right - 1) && isPalindrome(currentWindow)
            && currentWindow.length() > result.length()) {
          result = currentWindow;
          break;
        }
        right--;
      }
      if (s.length() - 1 - left < result.length()) {
        return result;
      }
    }

    return result;
  }

  public static boolean isPalindrome(String s) {
    int stringLength = s.length();
    for (int i = 0; i < stringLength / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

}
