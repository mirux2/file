package problemA;
import java.util.*;

public class Main_396 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arry = new int[N];
    int count = 0;

    for(int i = 0; i < arry.length; i++){
      arry[i] = sc.nextInt();
    }

    for(int i = 1; i < arry.length; i++){
      if(count == 0){
        if(arry[i] == arry[i-1]){
          count++;
        }
      }else if(count == 1) {
        if(arry[i] == arry[i-1]){
          count++;
          break;
        }else {
          count = 0;
        }
      }
    }

    if(count == 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

    sc.close();
  }
}
// 4/5 AC