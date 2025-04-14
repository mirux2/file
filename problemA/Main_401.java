package problemA;
import java.util.*;

class Main_401 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();

    if(S >= 200 && S <= 299){
      System.out.println("Success");
    }else{
      System.out.println("Failure");
    }

    sc.close();
  }

}
// real time AC