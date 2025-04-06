package problemB;
import java.util.*;

public class Main_396 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Integer>stack = new Stack<Integer>();
    int Q = sc.nextInt();
    int query;

    for(int i = 0; i < 100; i++){
      stack.push(0);
    }

    for(int i = 0; i < Q; i++){
      query = sc.nextInt();
      if(query == 1){
        stack.push(sc.nextInt());
      }else if(query == 2){
        System.out.println(stack.pop());
      }
    }
    
    sc.close();
  }
}
// 4/6 初見AC