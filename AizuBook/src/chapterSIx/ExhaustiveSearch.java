package chapterSIx;

import java.util.Scanner;

public class ExhaustiveSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			if(solve(A, 0, sc.nextInt())) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		sc.close();
	}

	public static boolean solve(int[] data, int i, int m) {
		if(m == 0) {
			return true;
		}

		if(i == data.length - 1) {
			if(data[i] == m) {
				return true;
			}else {
				return false;
			}
		}
		System.out.println(i);
		System.out.println(m);
		return solve(data , i + 1, m) || solve(data , i + 1 , m -data[i]);
	}

}
