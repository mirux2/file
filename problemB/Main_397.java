package problemB;
import java.util.Scanner;

public class Main_397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        char target = 'i';

        for (char c : S.toCharArray()) {
            if (c == target) {
                target = (target == 'i') ? 'o' : 'i';
            } else {
                ans++;
            }
        }

        if (target == 'o') ans++;
        System.out.println(ans);
        sc.close();
    }
}

// 4/3 WA
// 4/3 AC