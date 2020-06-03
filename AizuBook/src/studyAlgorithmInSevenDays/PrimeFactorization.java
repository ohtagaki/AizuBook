package studyAlgorithmInSevenDays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PrimeFactorization {

	static int checkNumber;

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(51) + 400;
		checkNumber= number;

		ArrayList<Integer> PrimeNumber = new ArrayList<>();
		PrimeNumber = isPrime(number);
		int[] count = new int[PrimeNumber.size() + 1];

		//割り切れた回数を入れる配列の初期化
		Arrays.fill(count, 0);


		//numberの平方根の数以下の素数で割り切れるかチェック
		for(int i = 0; i < PrimeNumber.size(); i++) {
			if(number == 1) break;
			int n = PrimeNumber.get(i);
			while(number % n == 0) {
				number /= n;
				count[i]++;
			}
		}
		//素数なら最初の値と変わらない
		if(checkNumber == number) {
			System.out.println(checkNumber + "は素数");
			return;
		}

		//結果出力
		System.out.println(checkNumber + "は");
		for(int i = 0; i < PrimeNumber.size(); i++) {
			if(count[i] != 0) System.out.println(PrimeNumber.get(i) + "を" + count[i] + "回");
		}
		System.out.println("と" + number + "を掛けた数");
	}


	//√num以下の素数を保持するリストを返すメソッド
	public static  ArrayList<Integer> isPrime(int num){
		ArrayList<Integer> PrimeNumber = new ArrayList<>();

		int number = (int) Math.floor(Math.sqrt(num));
		int[] data = new int[number + 1];
		Arrays.fill(data, 1);
		data[0] = 0;
	    data[1] = 0;
		//手順1
		int m = 2;
		do {
			//素数の倍数をリストから削除する
			for(int i = 2 * m; i < number + 1; i += m) {
				data[i] = 0;
			}
			//結果を格納
			PrimeNumber.add(m);
			//次の素数候補を見つける
			do {
				m++;
			}while(data[m] == 0 && m < number);
		}while(m < number);

		return PrimeNumber;
	}
}
