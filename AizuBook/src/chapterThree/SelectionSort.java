package chapterThree;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int A[] = new int[n];
			for(int i = 0; i < n; i++) {
				A[i] = scanner.nextInt();
			}

			scanner.close();

			//選択ソート
			int selectCount = 0;
			for(int i = 0; i < n-1; i++) {
				int minKey = i;
				for(int j = i; j <= n-1; j++) {
					if(A[minKey] > A[j]) {
						minKey = j;
					}
				}
				// 最小値が入れ替わっていなければ数値の入れ替えをスキップ
	            if (i == minKey) {
	                continue;
	            }

	            //値の交換
				int changeValue = A[i];
				A[i] = A[minKey];
				A[minKey] = changeValue;
				selectCount++;
			}
			System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
			System.out.println(selectCount);
	 }
}

