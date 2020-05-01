package chapterThree;

import java.util.Arrays;
import java.util.Scanner;

public class StableSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] array = new String[n];
		array = scanner.nextLine().split(" ");

		scanner.close();
        String[] arrayB = array.clone();
        String[] arrayS = array.clone();

        //バブルソート
        for(int i = 0; i <= n - 1; i++) {
			for(int j = n - 1; j >= i+1; j--) {
				if((int)arrayB[j-1].charAt(1) > (int)arrayB[j].charAt(1)) {
					String tmp = arrayB[j-1];
					arrayB[j-1] = arrayB[j];
					arrayB[j] = tmp;
				}
			}
		}
        for(int i = 0; i < arrayB.length; i++){
            System.out.print((i == 0 ? "" : " ") + arrayB[i]);
        }
        System.out.println();
        System.out.println("Stable");

        //選択ソート
        for(int i = 0; i <= n-1; i++) {
			int minKey = i;
			for(int j = i; j <= n-1; j++) {
				if((int)arrayS[j].charAt(1) < (int)arrayS[minKey].charAt(1)) {
					minKey = j;
				}
			}
			// 最小値が入れ替わっていなければ数値の入れ替えをスキップ
            if (i == minKey) {
                continue;
            }
            //値の交換
			String changeValue = arrayS[i];
			arrayS[i] = arrayS[minKey];
			arrayS[minKey] = changeValue;
		}

        for(int i = 0; i < arrayS.length; i++){
            System.out.print((i == 0 ? "" : " ") + arrayS[i]);
        }
        System.out.println();
        if(Arrays.equals(arrayS, arrayB)) {
        	System.out.println("Stable");
        }else {
        	System.out.println("Not stable");
        }
	}
}
