package studyAlgorithmInSevenDays;

import java.util.Random;

public class MaxOfArrayValues {

	public static int MaxOfArray = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}

		for(int i = 0; i < array.length; i++) {
			MaxOfArray = Math.max(MaxOfArray, array[i]);
			System.out.println(array[i]);
		}
		System.out.println(MaxOfArray);
	}

}
