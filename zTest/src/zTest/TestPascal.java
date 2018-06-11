package zTest;

import java.util.ArrayList;
import java.util.List;

public class TestPascal {

	public static void main(String[] args) {

		int n = 10;

		int[][] arr = new int[n][n];
		int prevSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
					System.out.print(1 + " ");
				} else {
					prevSum = arr[i - 1][j - 1] + arr[i - 1][j];
					arr[i][j] = prevSum;
					System.out.print(prevSum + " ");
				}
			}

			System.out.println();
		}
		
		
		
		List<? super Integer> intList = new ArrayList<Number>();
		intList.add(7);

	}

}
