package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortInDay5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		//選択ソート(昇順に並べる場合)
		for(int i = 0; i < array.length; i++) {
			int tmpIndex = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[tmpIndex] > array[j]) {
					tmpIndex = j;
				}
			}
			//最小値を持つ添え字の値が変わっていれば値交換
			if(tmpIndex != i) {
				int temp = array[tmpIndex];
				array[tmpIndex] = array[i];
				array[i] = temp;
			}
		}
		//ソート後
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

	}

}
