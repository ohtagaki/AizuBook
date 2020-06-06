package studyBasicAlgorithmInSevenDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BinarySeacrhDay4 {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			int number = rand.nextInt(51);
			list.add(number);
		}

		//二分探索で全探索
		//①昇順・降順のいずれかにソートする
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				System.out.print("[" + list.get(i) + ",");
			}else if(i == list.size() - 1) {
				System.out.println(list.get(i) + "]");
			}else {
				System.out.print(list.get(i) + ",");
			}
		}
		int check = 2;

		int i = 0;
		int left = 0;
		int right = list.size();
		int key = check;
		while(left < right) {
			int mid = (left + right) / 2;
			System.out.println(list.get(mid));
			System.out.println("-------------------");
			if(key == list.get(mid)) {
				System.out.println(i +"回サーチ");
				System.out.println(check + "は" + (mid + 1) + "番目にあります");
				return;
			}else if(key < list.get(mid)) {
				right = mid;
			}else {
				left = mid + 1;
			}
			i++;
		}
		System.out.println(i +"回サーチ");
		System.out.println(check + "はlist内にありません" );
	}

}
