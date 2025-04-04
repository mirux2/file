package problemB;
import java.util.Scanner;

public class Main_399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] score = new int[N][2];
		int rank = 1;
		int i;
		
		for(i = 0; i < N; i++) {
			score[i][0] = sc.nextInt();
			score[i][1] = 0;
		}

		
		while(rank <= N) {
			int k = 0;
			int x = 0;
			for(i = 0; i < N; i++) {
				if(score[i][1] == 0) {
					if(x <= score[i][0]) {
						x = score[i][0];
					}				
				}
			}
			for(i = 0; i < N; i++) {
				if(score[i][0] == x) {
					score[i][1] = rank;
					k++;
				}
			}
			rank += k;
		}
		
		for(i = 0; i < N; i++) {
			System.out.println(score[i][1]);
		}
		
		sc.close();
	}
}
//real time AC!!!!!!!!!!!!!!!!!!!!!!!!!!
