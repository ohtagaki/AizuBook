package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class CountingSortInDay6 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
		
		//分布数え上げソート
		int[] counts = new int[51];
		for(int i = 0; i < array.length; i++) {
			counts[array[i]]++;
		}
		System.out.println(Arrays.toString(counts).replaceAll("[,\\[\\]]", ""));
		
		int total = 0;
		for(int i = 0; i < 50; i++) {
			int count = counts[i]++;
			counts[i] = total;
			total += count;
		}
		System.out.println(Arrays.toString(counts).replaceAll("[,\\[\\]]", ""));
		
		int[] sortedValues = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedValues[counts[array[i]]] = array[i];
            counts[array[i]] ++ ;
        }
        System.out.println(Arrays.toString(sortedValues).replaceAll("[,\\[\\]]", ""));
        
	}
}
