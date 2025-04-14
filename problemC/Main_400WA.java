package problemC;
import java.util.Scanner;

public class Main_400WA {
    public static int binarySearch(int n, int[] a, int x) {
        int l = 0;
        int r = n - 1; // a[l], a[l+1], ..., a[r] が探索範囲

        while (r - l + 1 >= 1) { // 探索範囲の長さ r - l + 1 が 1 以上のあいだループする
            int m = (l + r) / 2; // (l + r) / 2 を小数点以下切り捨て
            if (a[m] == x) {
                return m; // 見つけた場合
            }
            if (a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1; // 見つからない場合
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 配列の長さ
        int n = scanner.nextInt();

        // 配列 a の読み込み
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 見つけたい値
        int x = scanner.nextInt();

        // 関数を実行
        int result = binarySearch(n, a, x);

        // 結果を出力
        System.out.println(result);
    }
}
