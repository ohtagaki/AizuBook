package chapterFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StudyDoublyLinkedList {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> list = new ArrayDeque<String>();

		int number = Integer.parseInt(br.readLine());
		for(int i = 0; i < number; i++) {
			String[] command = br.readLine().split(" ");
			if(command[0].equals("insert")) {
				list.addFirst(command[1]);
			}else if(command[0].equals("delete")) {
				list.remove(command[1]);
			}else if(command[0].equals("deleteFirst")) {
				list.removeFirst();
			}else if(command[0].equals("deleteLast")) {
				list.removeLast();
			}
		}
		System.out.print(list.remove());
		while(!list.isEmpty()) {
			System.out.print(" " + list.remove());
		}
		System.out.println();
	}

}
