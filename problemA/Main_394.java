package problemA;
import java.util.Scanner;

public class Main_394 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[]str = S.toCharArray();
		
		for(int i = 0; i < S.length(); i++) {
			if(str[i] != '2') {
				str[i] = '\s';
			}
		}
		
		String S2 = new String(str);
		
		String result = S2.replace("\s","");
		
		
		System.out.println(result);
		
		sc.close();
	}
}
// AC
