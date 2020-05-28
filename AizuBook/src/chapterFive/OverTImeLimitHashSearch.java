package chapterFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OverTImeLimitHashSearch {
	static long M = 2147483647;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> command = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Long> dictonary = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] dic = br.readLine().split(" ");
			command.add(dic[0]);
			list.add(dic[1]);

			if(command.get(i).equals("find")) {
				long checkKey = find(list.get(i));
				if(dictonary.contains(checkKey)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else {
				insert(list.get(i), dictonary);
			}
		}
		br.close();

		for(int i = 0; i < n; i++) {
			if(command.get(i).equals("find")) {
				long checkKey = find(list.get(i));
				if(dictonary.contains(checkKey)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else {
				insert(list.get(i), dictonary);
			}
		}
	}

	//文字から数値に変換
	static int getChar(char ch) {
		if(ch == 'A') return 1;
		else if(ch == 'C') return 2;
		else if(ch == 'G') return 3;
		else if(ch == 'T') return 4;
		else return 0;
	}

	//文字列から数値に変換してkeyを生成する
	static long getKey(String str) {
		long sum = 0;
		long p = 1;
		for(int i = 0; i < str.length(); i++) {
			sum += p * getChar(str.charAt(i));
			p *= 10;
		}
		return sum;
	}

	static long find(String str) {
		long key = getKey(str);
		return key;
	}


	static void insert(String str, ArrayList<Long> list) {
		long key = getKey(str);
		list.add(key);
	}

}
