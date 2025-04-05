package problemA;
import java.util.*;

public class Main_400 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = 0;

    if(400 % A == 0){
      B = 400 / A;
      System.out.println(B);
    }else {
      System.out.println(-1);
    }

    sc.close();
  }
}
//real time AC