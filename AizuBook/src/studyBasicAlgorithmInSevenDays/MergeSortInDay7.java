package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class MergeSortInDay7 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		sort(array, 0 ,array.length - 1);

		//ソート後
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
	}

	public static void merge(int[] array, int low, int middle, int high) {
		int[] helper = new int[array.length];

		for(int i = low; i <= high; i++) {
			helper[i] = array[i];
		}

		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;

		while(helperLeft <= middle && helperRight <= high) {
			if(helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			}else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}

		int remaining = middle - helperLeft;
		for(int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}

	public static void sort(int[] array, int low, int high) {
		if(low < high) {
			int middle = (low + high) >>> 1;
			sort(array, low, middle);
			sort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}
}
