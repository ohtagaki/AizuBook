package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class ShellSortInDay5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		//シェルソート(昇順に並べる場合)
		int h = array.length / 2;
		while(h > 0) {
			for(int i = h; i < array.length; i++) {
				int j = i;
				while(j >= h && array[j - h] > array[j]) {
					int tmp = array[j - h];
					array[j - h] = array[j];
					array[j] = tmp;
					j--;
				}
			}
			h /= 2;
			System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
		}
		System.out.println("----------------------------");
		//ソート完了後
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
	}

}
