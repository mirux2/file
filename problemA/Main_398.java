package problemA;
import java.util.Scanner;

public class Main_398 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] str = new char[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = '-';
		}
		
		if(str.length % 2 == 0) {
			str[(N / 2) - 1] = '=';
			str[N / 2] = '=';
		} else {
			str[(N - 1) / 2] = '=';
		}			
		
		String S = new String(str);
		System.out.println(S);
		
		sc.close();
	}
}

//real time AC!!!!!!!!!!!