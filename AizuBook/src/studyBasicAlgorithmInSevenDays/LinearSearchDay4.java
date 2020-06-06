package studyBasicAlgorithmInSevenDays;

import java.util.ArrayList;
import java.util.Random;

public class LinearSearchDay4 {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			int number = rand.nextInt(51);
			list.add(number);
		}

		//線形探索で全探索
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				System.out.print("[" + list.get(i) + ",");
			}else if(i == list.size() - 1) {
				System.out.println(list.get(i) + "]");
			}else {
				System.out.print(list.get(i) + ",");
			}
		}
		int check = 30;
		for(int i = 0; i < list.size(); i++) {
			int tmp = list.get(i);
			if(tmp == check) {
				System.out.println(check + "は" + (i + 1) + "番目にあります");
				return;
			}else {
				continue;
			}
		}

		System.out.println(check + "はlist内にありません" );
	}

}
