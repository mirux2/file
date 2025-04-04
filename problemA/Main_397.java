package problemA;
import java.util.Scanner;

public class Main_397 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		
		if(t >= 38.0) {
			System.out.println(1);
		}else if(t >= 37.5) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		
		sc.close();
	}
}

// 4/3 AC