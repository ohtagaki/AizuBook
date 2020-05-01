package chapterFive;

import java.util.Scanner;



public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int[] t = new int[n];
		for(int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();
		//線形探索
		int count = 0;
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < n; j++) {
				if(s[j] == t[i]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
