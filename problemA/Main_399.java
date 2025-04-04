package problemA;
import java.util.Scanner;

public class Main_399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		char[] s = new char[N];
		char[] t = new char[N];
		int count = 0;
		
		s = S.toCharArray();
		t = T.toCharArray();
		
		for(int i = 0; i < N; i++) {
			if(s[i] != t[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}

//real time AC