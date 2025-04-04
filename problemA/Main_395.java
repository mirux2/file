package problemA;
import java.util.Scanner;

public class Main_395 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arry = new int[N];
		String judge = "Yes";
		
		for(int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
			if(i >= 1) {
				if(arry[i] <= arry[i - 1]) {
					judge = "No";
					break;
				}
			}
		}
		
		System.out.println(judge);
		
		sc.close();
	}

}

//AC
