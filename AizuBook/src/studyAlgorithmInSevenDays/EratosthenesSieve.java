package studyAlgorithmInSevenDays;

import java.util.Arrays;
import java.util.Random;

public class EratosthenesSieve {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(51) + 100;
		int[] data = new int[number + 1];
		int[] result = new int[number + 1];

		//手順1
		int m = 2;
		//手順2
		int n = 0;
		//手順3
		Arrays.fill(data, 1);
		//手順4
		Arrays.fill(result, 0);
		//手順5 0と1は最初から除外する
		data[0] = data[1] = 0;

		do {
			//素数の倍数をリストから削除する
			for(int i = 2 * m; i < number + 1; i += m) {
				data[i] = 0;
			}
			//結果を格納
			result[n] = m;
			n++;
			//次の素数候補を見つける
			do {
				m++;
			}while(data[m] == 0 && m < number);
		}while(m < number);

		//結果を出力
		for(int i = 0; i < result.length; i++) {
			if(result[i] == 0) break;
			System.out.print(result[i] + " ");
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

}
