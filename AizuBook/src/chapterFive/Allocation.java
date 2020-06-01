package chapterFive;

import java.util.Scanner;

public class Allocation {

	//field
	static int loadSize, truck;
	static int[] input;


	//5-6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loadSize = sc.nextInt();
		truck = sc.nextInt();
		input = new int[loadSize];

		for(int i = 0; i < loadSize; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		int answer = solve();
		System.out.println(answer);
	}

	private static int solve() {
		int left = 0;
		//荷物の個数 * 1個当たりの最大重量
		int right = 100000 * 10000;
		while(right > left + 1) {
			int mid = (left + right) / 2;
			//mid = Pの場合、荷物を何個積めるかチェック
			int v = search_maxv(mid);
			if(v >= loadSize) {
				right = mid;
			}else {
				left = mid;
			}
		}
		return right;
	}

	//最大積載量Pのk台のトラックで何個荷物を積めるか
	private static int search_maxv(int P) {
		int v = 0;
		for(int i = 0; i < truck; i++) {
			int w = 0;
			while( w + input[v] <= P) {
				w += input[v];
				v++;
				if(v == loadSize) {
					return v;
				}
			}
		}
		return v;
	}

}
