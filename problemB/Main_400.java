package problemB;
import java.util.*;

public class Main_400 {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arry = new int[M + 1];
    int sum = 0;
    int f = 0;
    
    for(int i = 0; i < arry.length; i++ ){
      int tmp = 1;
      for(int j = 0; j < i; j++){
        if(tmp > 1000000000 / N) {
          f++;
          break;
        }else {
          tmp = tmp * N;
        }
      }
      if(sum > 1000000000 - tmp) {
        f++;
        break;
      }else {
        sum += tmp;
      }
    }

    if(f == 0){
      System.out.println(sum);
    }else {
      System.out.println("inf");
    }

    sc.close();
  }
}
// real time AC