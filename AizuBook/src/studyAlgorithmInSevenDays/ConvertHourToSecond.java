package studyAlgorithmInSevenDays;

import java.util.Random;

public class ConvertHourToSecond {

	public static void main(String[] args) {
		Random rand = new Random();
		int hours1 = rand.nextInt(24);
		int minutes1 = rand.nextInt(24);
		int seconds1 = rand.nextInt(60);
		int time1 = hours1 * 3600 + minutes1 * 60 + seconds1;

		int hours2 = rand.nextInt(24);
		int minutes2 = rand.nextInt(24);
		int seconds2 = rand.nextInt(60);
		int time2 = hours2 * 3600 + minutes2 * 60 + seconds2;

		//2つの時間差を秒から時間・分・秒に変換
		int diffTime = 0;
		if(time1 >= time2) {
			diffTime = time1 - time2;
		}else {
			diffTime = time2 - time1;
		}

		int h = diffTime / 3600;
		int n = diffTime % 3600;
		int m = n / 60;
		int s = n % 60;
		System.out.println("時間差は" + h + "時間" + m + "分" + s + "秒");


	}

}
