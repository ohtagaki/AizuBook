package chapterFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashSearch {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String[] dic = br.readLine().split(" ");
			String command = dic[0];
			String target = dic[1];

			switch(command){
			case "insert":
				map.put(target, null);
				break;
			case "find":
				if(map.containsKey(target)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
				break;
			}
		}
	}
}
