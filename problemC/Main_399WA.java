package problemC;
import java.util.Scanner;

public class Main_399WA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int ans = 0;
        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;

            if (uf.same(a, b)) {
                ans++;
                continue;
            }
            uf.merge(a, b);
        }

        System.out.println(ans);
        scanner.close();
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public void merge(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // 経路圧縮
        }
        return parent[x];
    }
}


//初見 WA
/*
森を求めるには
今グラフにある辺の数(入力したグラフ) - 木構造が成立するための最大の辺の本数（連結成分数）
を考える。つまり、
木構造にするための最小限削除する辺の本数というよりは、
木構造になるために残す最大の辺の本数を考える。
連結成分数(最大の辺の本数) = 頂点 - 1 が成立する。
よって、
unionfind(DSU)を用いてサイクルができていないか探索する。

*/