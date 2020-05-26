package chapterThree;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//3-2 挿入ソート
public class InsertSort {
	 public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		scanner.close();

		//昇順に並べる挿入ソート
		for(int i = 0; i < A.length; i++) {
			int tmp = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > tmp) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = tmp;
			//System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
		}
		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
		
		//降順に並べる挿入ソート
		for(int m = 0; m < A.length; m++) {
			int temp = A[m];
			int l = m - 1;
			while(l >= 0 && A[l] < temp) {
				A[l + 1] = A[l];
				l--;
			}
			A[l + 1] = temp;
		}
		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
	 }
}
