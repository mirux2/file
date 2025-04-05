package problemB;
import java.util.*;

public class Main_396mikan {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Integer>stack = new Stack<Integer>();
    int Q = sc.nextInt();
    int[] query = new int[Q];
    int count = 0;

    for(int i = 0; i < 100; i++){
      stack.push(0);
    }

    for(int i = 0; i < query.length; i++){
      query[i] = sc.nextInt();
      if(query[i] == 1){
        stack.push(sc.nextInt());
      }else if(query[i] == 2){
        count++;
      }
    }
    
    for(int i = 0; i < count; i++){
      System.out.println(stack.pop());
    }

    sc.close();
  }
}
//未完