package patternProblems;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {

		int[] list =new int []{1, 2, 5, 10, 17};
		for(int i = 0; i < factorial(5); i++) {
			next_permutation(list, 0, list.length);
		}
	}


	//n の階乗
	public static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n - 1);
	}

	//次の順列を生成する
	public static boolean next_permutation(int[] array, int start, int end) {
		if(array == null || start > end || start < 0 || end > array.length) {
			System.out.println("Error: 引数が正しくありません。");
			return false;
		}
		for(int i = end - 2; i >= start; i--) {
			if(array[i] < array[i + 1]) {
				int j = end -1;
				while(array[i] >= array[j]) {
					j--;
				}

				//値を交換
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;

				//辞書順に並べるため、i + 1 以降を昇順に並べる
				Arrays.sort(array, i + 1, end);

				System.out.println(Arrays.toString(array));
				return true;
			}
		}
		return false;
	}

}
