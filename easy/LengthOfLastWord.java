public class LengthOfLastWord {

  public static void main(String[] args) {
    String sentence = "luffy is still joyboy  ";
    System.out.println(lengthOfLastWord(sentence));
  }

  public static int lengthOfLastWord(String s) {
    s = s.stripTrailing();
    return s.length() - s.lastIndexOf(' ') - 1;
  }
}
