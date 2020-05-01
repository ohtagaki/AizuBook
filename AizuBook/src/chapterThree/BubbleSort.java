package chapterThree;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int changeCount = 0;
		scanner.close();
		//バブルソート
		for(int i = n - 1; i > 1; i--) {
			boolean flag = true;
			while(flag) {
				flag = false;
				for(int j = n - 1; j >= 1; j--) {
					int key = A[j];
					if(A[j-1] > key) {
						A[j] = A[j-1];
						A[j-1] = key;
						flag = true;
						changeCount++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
		System.out.println(changeCount);
	}
}
