package chapterSIx;

public class FIndMax {
	public static void main(String[] args) {
		int n[];
		n = new int[6];

		n[0] = 18;
		n[1] = 29;
		n[2] = 36;
		n[3] = 12;
		n[4] = 45;
		n[5] = 24;
		
		
		System.out.println(findMaximum(n , 1 , 4));
	}
	public static int findMaximum(int[] A , int left, int right) {
		int mid = ( left + right ) / 2;
		if(left == right - 1) {
			return A[left];
		}else {
			int u = findMaximum(A , left, mid);
			int v = findMaximum(A , mid, right);
			return Math.max(u,v);
		}
	}
}
