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
		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));

		//挿入ソート
		for(int j = 1; j < A.length; j++) {
			int key = A[j];
			int check = j -1;
			while( check >= 0 && A[check] > key) {
				A[check + 1] = A[check];
				check--;
			}
			A[ check +  1] = key;
			System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
		}
	 }
}
