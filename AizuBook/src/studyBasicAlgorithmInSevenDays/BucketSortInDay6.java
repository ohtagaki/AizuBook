package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class BucketSortInDay6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(51);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		//バケットソート
		int[] bucket = new int[51];
		for(int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for(int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}
		System.out.println(Arrays.toString(bucket).replaceAll("[,\\[\\]]", ""));

		int outPos = 0;
        for (int i = 0; i < bucket.length; i++){
        	//bucket[i] = 0であれば、ループ内に入らない
        	for (int j = 0; j < bucket[i]; j++){
        		array[outPos++] = i;
        		}
        	}

        //ソート後
        System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
	}

}
