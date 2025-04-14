package problemB;
import java.util.*;

public class Main_393 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int j = 1;
    int k = 2;
    int count = 0;

    while(k < S.length()){
      int a = 0;
      int b = j;
      int c = k;
      while(c < S.length()){
        if(S.charAt(a) == 'A'){
          if(S.charAt(b) == 'B'){
            if(S.charAt(c) == 'C'){
              count++;
            }
          }
        }
        a++;
        b++;
        c++;
      }
      j++;
      k += 2;
    }

    System.out.println(count);
    sc.close();
  }
}

// 4/7 初見AC