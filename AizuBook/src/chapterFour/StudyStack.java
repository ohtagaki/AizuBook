package chapterFour;

import java.util.Scanner;
import java.util.Stack;


//4-2 スタック
public class StudyStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String poland = sc.nextLine();

		String[] e = poland.split(" ");
		Stack<Integer> s = new Stack<>();

		for(int i = 0; i < e.length; i++) {
			switch(e[i]) {
			case "+":
				s.push(s.pop() + s.pop());
				break;

			case "-":
				s.push(-s.pop() + s.pop());
				break;

			case "*":
				s.push(s.pop() * s.pop());
				break;

			default:
				s.push(Integer.valueOf(e[i]));
				break;
			}
		}
		System.out.println(s.pop());

		sc.close();
	}

}
