package problemB;
import java.util.Arrays;
import java.util.Scanner;

public class Main_394 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		String tmp;
//		String str = "";
		String[] S = new String[N];
		
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		
//		for(int i = 0; i < S.length - 1; i++) { 
//			for(int j = 0; j < S.length - 1 - i; j++) { 
//				if(S[j].length() > S[j+1].length()) { 
//					tmp = S[j];
//					S[j] = S[j+1];
//					S[j+1] = tmp;
//				}
//			}			
//		}
		
		Arrays.sort(S,(x,y) -> Integer.compare(x.length(),y.length()));
		//このメソッドでも配列をソートできる
		
//		for(int i = 0; i < N; i++) {
//			str += S[i];
//		}
		
		StringBuilder ans = new StringBuilder();
		for (String str : S) { ans.append(str); }
		//こっちのが演算子よりも速いらしい
		
//		System.out.println(str);
		System.out.println(ans.toString());
		
		sc.close();
	}
}

// 3/30 ネット・独自 AC