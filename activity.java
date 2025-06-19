package hlo;

import java.util.*;

public class activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int e[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        int i = 0;
        System.out.print(i + " ");
        for (int j = 1; j < n; j++) {
            if (s[j] >= e[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
}
