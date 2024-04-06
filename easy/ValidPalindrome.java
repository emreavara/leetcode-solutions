
public class ValidPalindrome {

  public static void main(String[] args) {
    String palindromeString = "A man, a plan, a canal: Panama";
    String palindromeString2 = ",.";

    String nonPalindromeString = "race a car";

    System.out.println("Should be true: " + isPalindrome(palindromeString));
    System.out.println("Should be true: " + isPalindrome(palindromeString2));
    System.out.println("Should be false: " + isPalindrome(nonPalindromeString));
  }

  public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
//    s = s.toLowerCase();
    while(left<right){
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);
      if(!Character.isLetterOrDigit(leftChar)){
        left++;
      } else if (!Character.isLetterOrDigit(rightChar)){
        right--;
      } else if(leftChar == rightChar || isEqual(leftChar, rightChar)){
        left++;
        right--;
      } else {
        return false;
      }
    }
    return true;
  }
  public static boolean isEqual(char left, char right){
    if(left > 64 && left < 123 && right > 64 && right < 123 ){
      return left == right -32 || left == right +32;
    }
    return false;
  }
}
