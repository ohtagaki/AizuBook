package studyAlgorithmInSevenDays;

import java.util.Random;

public class EuclideanAlgorithm {

	public static void main(String[] args) {
		Random rand = new Random();
		int m =  rand.nextInt(101) + 900;
		int n =  rand.nextInt(51);

		int startM = m;
		int startN = n;

		int divisionNum;
		do{
			divisionNum = m % n;
			if(divisionNum == 0) break;
			m = n;
			n = divisionNum;
		}while(divisionNum != 0) ;

		System.out.println(startM + "と" + startN + "の最大公約数は" + n);
	}

}
