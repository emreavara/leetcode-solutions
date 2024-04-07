public class MinimumRemoveToMakeValidParantheses {

  public static void main(String[] args) {
    String s1 = "lee(t(c)o)de)";
    String s2 = "a)b(c)d";
    String s3 = "))((";
    String s4 = "abc";
    String s5 = "())()(((";

    System.out.println("Should be lee(t(co)de) : " + minRemoveToMakeValid(s1));
    System.out.println("Should be ab(c)d : " + minRemoveToMakeValid(s2));
    System.out.println("Should be '' : " + minRemoveToMakeValid(s3));
    System.out.println("Should be abc : " + minRemoveToMakeValid(s4));
    System.out.println("Should be abc : " + minRemoveToMakeValid(s5));

  }

  public static String minRemoveToMakeValid(String s) {
    int left =0, right = s.length() -1;
    StringBuilder leftString = new StringBuilder();
    StringBuilder rightString = new StringBuilder();
    while (left<right){
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);
      if(leftChar != '(' && leftChar != ')'){
        leftString.append(leftChar);
        left++;
      } else if(rightChar != ')' && rightChar != '('){
        rightString.append(rightChar);
        right --;
      } else if(leftChar == '(' && rightChar == ')'){
        leftString.append(leftChar);
        rightString.append(rightChar);
        left++;
        right --;
        if(left == right){
          leftString.append(s.charAt(left));
        }
      } else if(leftChar == '(') {
        left++;
      }
        else if(rightChar == ')') {
        right++;
      } else {
          left++;
      }
      if(left == right && leftChar != '(' && leftChar != ')'){
        leftString.append(s.charAt(left));
      }


    }
    return leftString.append(rightString.reverse()).toString();
  }

}
