package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortInDay5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				System.out.print("[" + array[i] + ",");
			}else if(i == array.length - 1) {
				System.out.println(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}

		//バブルソート(昇順に並べる場合)
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		//バブルソート(降順に並べる場合)
	}
}
