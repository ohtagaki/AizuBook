package chapterFour;

import java.util.Scanner;
import java.util.Stack;


//4-6 データ構造の応用(いったん無視)
public class StudyAreasOnDiagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int A = str.length();
		sc.close();

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();

		int j;
		int tmp;
		int delete;
		int total = 0;
		for(int i = 0; i < A; i++) {
			if(str.charAt(i) == '\\') {
				stack1.add(i);
			}else if(str.charAt(i) == '/' && stack1.isEmpty()) {
				j = stack1.pop();
				tmp = i -j;
				total = total + tmp;
				while(!stack2.isEmpty() && stack2.get(stack2.size() - 1) > j) {
					tmp = tmp + stack3.pop();
					delete = stack2.pop();
				}
				stack2.add(j);
				stack3.add(tmp);
			}
		}
		System.out.println(total);
		if(stack3.size() != 0){
			System.out.print(stack3.size() + " ");
		}else{
			System.out.println(stack3.size());
		}

		for(int x = 0; x < stack3.size(); x++){
			if(x != stack3.size() - 1){
				System.out.print(stack3.get(x) + " ");
			}else{
				System.out.println(stack3.get(x));
			}
		}
	}
}
