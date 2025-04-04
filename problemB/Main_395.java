package problemB;
import java.util.Scanner;

public class Main_395 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 0;
		int y = N;
		int i,j;
		String[][] grid = new String[N][N];
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				grid[i][j] = "?";
			}
		}
		
		
		while(x <= y) {
			if(x % 2 == 0) {
				for(i = x; i < y; i++) {
					for(j = x; j < y; j++) {
						grid[i][j] = "#";
					}
				}				
			} else {
				for(i = x; i < y; i++) {
					for(j = x; j < y; j++) {
						grid[i][j] = ".";
					}
				}	
			}
			x++;
			y--;
		}
		
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}

// 3/30 一発AC