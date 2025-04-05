package problemB;
import java.util.Scanner;

public class Main_398WA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] stock = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int drowCard;
		int tmp;
		
		for(int i = 0; i < 7; i++) {
			drowCard = sc.nextInt();
			for(int j = 0; j < stock.length; j++) {
				if(drowCard == j + 1) {
					stock[j]++;
				}
			}
		}
		
		
		
		for(int i = 0; i < stock.length - 1; i++) {
			for(int j = 0; j < stock.length - 1 - i; j++) {
				if(stock[j] > stock[j+1]) {
					tmp = stock[j];
					stock[j] = stock[j+1];
					stock[j+1] = tmp;
				}
			}			
		}
		
		if(stock[12] >= 3 && stock[11] >= 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}

//real time WA
// 3/29 解答 AC
