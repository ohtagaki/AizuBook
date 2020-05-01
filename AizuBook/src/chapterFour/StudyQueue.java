package chapterFour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//4-3 キュー
public class StudyQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int quantum = sc.nextInt();

		Queue<String> names = new LinkedList<String>();
		Queue<Integer> times = new LinkedList<Integer>();

		for(int i=0; i < number; i++) {
			names.add(sc.next());
			times.add(sc.nextInt());
		}

		int totalTime = 0;
		Queue<String> resultNames = new LinkedList<String>();
		Queue<Integer> resultTimes = new LinkedList<Integer>();
		while(!names.isEmpty()) {
			int tempTime = times.remove();
			if( tempTime <= quantum) {
				totalTime = totalTime + tempTime;
				resultNames.add(names.remove());
				resultTimes.add(totalTime);
			}else {
				totalTime = totalTime + quantum;
				names.add(names.remove());
				times.add(tempTime - quantum);
			}
		}
		for(int i = 0; i < number; i++) {
			System.out.println(resultNames.remove() + " " + resultTimes.remove());
		}

		sc.close();
	}
}
