package problemC;
import java.util.*;

class Main_401WA {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N+1];
    long ans;
    boolean a = true;

    for(int i = 0; i < A.length; i++){
      A[i] = 0;
    }

    if(K > N){
      a = false;
      for(int i = 0; i < K; i++){
        if(i > N){
          break;
        }
        A[i] = 1;
      }
    }else {
      for(int i = 0; i < K; i++){
        A[i] = 1;
      }
      A[K] = K;
    }
    if(a){
      for(int i = K; i <= N; i++){
        if(2 * K - i <= 0){
          for(int j = K; j < i; j++){
            A[i] += A[j];
          }
        }else {
          for(int j = K; j < i; j++){
            A[i] = (2 * K - i) + A[j];
          }
        }
      }
    }

    for(int i = 0; i < A.length; i++){
      System.out.print(A[i] + " ");
    }
    System.out.println();

    ans = A[N] % 1000000000;
    System.out.println(ans);
    sc.close();
  }

}

//real time WA