package studyBasicAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class RadixSortInDay6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			int number = rand.nextInt(1001);
			array[i] = number;
		}
		//ソート前
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));

		array = radixSort(array, true);
		//ソート後
		System.out.println(Arrays.toString(array).replaceAll("[,\\[\\]]", ""));
	}

	public static int[] radixSort(int[] array , boolean check) {
		int n = array.length;

        int i;
        Integer maxValue = null;

        int exp = 1; // digit
        int[] tmp = new int[n];
        int[] hists = new int[10];

        while (true) {
        	Arrays.fill(hists, 0);

        	if (maxValue == null) { // for exit condition
        		maxValue = array[0];
        		for (int ar : array) {
        			if (ar > maxValue)
        				maxValue = ar;
        			hists[(ar / exp) % 10]++; // frequency distribution of digit 0..9
        			}
        	}else{
                for (int ar : array) {
                	hists[(ar / exp) % 10]++; // frequency distribution of digit 0..9
                }
            }

        	if (check) {
                for (i = 9; i > 0; i--)
                    hists[i - 1] += hists[i]; // cumulative frequency distribution
            } else { // ascending order
                for (i = 1; i < 10; i++)
                    hists[i] += hists[i - 1]; // cumulative frequency distribution
            }
            for (i = n - 1; i >= 0; i--)
                tmp[--hists[(array[i] / exp) % 10]] = array[i];

            exp *= 10; // next digit
            if (maxValue / exp <= 0)
            	return tmp;
            System.arraycopy(tmp, 0, array, 0, n); // copy to results array
          }
	}
}
