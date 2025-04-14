package problemB;
import java.util.*;

class Main_401 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String status;
    boolean log = true;
    int err = 0;
    
    for(int i = 0; i < N; i++){
      status = sc.next();
      if(status.equals("login")){
        log = false;
      }else if(status.equals("logout")){
        log = true;
      }else if(status.equals("private")){
        if(log){
          err++;
        }
      }
     }

    System.out.println(err);
    sc.close();
  }

}
//real time AC