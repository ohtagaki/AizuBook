package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortInDay5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		//挿入ソート(昇順に並べる場合)
		for(int i = 0; i < array.length; i++) {
			int j = i;
			while(j >= 1 && array[j - 1] > array[j]) {
				int tmp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = tmp;
				j--;
			}
		}
		//昇順ソート後
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
	}

}
