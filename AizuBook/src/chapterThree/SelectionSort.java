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
			int changeCount = 0;

			//昇順に並べる選択ソート
			for(int i = 0; i < A.length; i++) {
				int minIndex = i;
				for(int j = i; j < A.length; j++) {
					if(A[minIndex] > A[j]) {
						minIndex = j;
					}
				}
			//最小値を持つ添え字の値が変わっていなければ値交換はしなくてよい
			if(minIndex == i) continue;
			//値交換
			int tmp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = tmp;
			changeCount++;
			}
			System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
			System.out.println(changeCount);

			//降順に並べる選択ソート
			for(int i = 0; i < A.length; i++) {
				int minIndex = i;
				for(int j = i; j < A.length; j++) {
					if(A[minIndex] < A[j]) {
						minIndex = j;
					}
				}
				//最小値を持つ添え字の値が変わっていなければ値交換はしなくてよい
				if(minIndex == i) continue;
				//値交換
				int tmp = A[i];
				A[i] = A[minIndex];
				A[minIndex] = tmp;
			}
			System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
	 }
}

