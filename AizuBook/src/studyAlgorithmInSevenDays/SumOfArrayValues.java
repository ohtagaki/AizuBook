package studyAlgorithmInSevenDays;

import java.util.Random;

public class SumOfArrayValues {

	public static int sumOfArray = 0;

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}

		for(int i = 0; i < array.length; i++) {
			sumOfArray += array[i];
			System.out.println(array[i]);
		}
		System.out.println(sumOfArray);

	}

}
