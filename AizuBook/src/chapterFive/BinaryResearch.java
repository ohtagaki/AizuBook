package chapterFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryResearch {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] ss = br.readLine().split(" ");
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(ss[i]);
		}

		int q = Integer.parseInt(br.readLine());
		String[] st = br.readLine().split(" ");
		int[] t = new int[q];
		for(int i = 0; i < q; i++) {
			t[i] = Integer.parseInt(st[i]);
		}

		//2分探索
		int i = 0;
		int count = 0;
		while(i != t.length) {
			int left = 0;
			int right = s.length;
			while(left < right) {
				int mid = (left + right) / 2;
				if(s[mid] == t[i]) {
					count++;
					break;
				}else if(t[i] < s[mid]) {
					right = mid;
				}else {
					left = mid + 1;
				}
			}
			i++;
		}
		System.out.println(count);
	}
}
