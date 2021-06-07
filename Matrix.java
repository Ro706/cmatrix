import java.util.*;
class effect {
  static int wait = 0;
  static int limit = 20;
  public static void print(char st) {
    print(Character.toString(st));
  }
  public static void print(String st) {
    for (int i = 0; i < st.length(); i++) {
      try {
        Thread.sleep(wait);
      } catch (Exception e) {}
      if (st.charAt(i) == '\n') {
        System.out.println();
      } else {
        System.out.print(st.charAt(i));
      }
    }
  }
  public static void main(String[]args) {
    String st = "qwertyuiopasdfghjklzxcvbnm1234567890@#_₹&-+()*':;!?~`|•√π÷×¶∆}{=°^¢$€£%©®™℅[]<>";
    Random ran = new Random();
    int kk ;
    for (;;) {
      kk = ran.nextInt(limit);
      ArrayList<Integer> val = new ArrayList<>();
      int temp = ran.nextInt(limit);
      for (int i = 0; i < temp; i++) {
        val.add(ran.nextInt(10));
      }
      for (int k = 0; k < kk; k++) {
        for (int i = 0; i < val.size(); i++) {
      print(st.charAt(ran.nextInt(st.length())));  
            for (int j = 0; j < val.get(i); j++) {
            print(" ");
          }
        }
        print("\n");
      }

    }
  }
}
