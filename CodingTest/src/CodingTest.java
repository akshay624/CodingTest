import java.util.Arrays;
import java.util.Scanner;

public class CodingTest {
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static int getMinSecond(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int a = 0;
		int total = 0;

		try {
			System.out.println("Enter number of test cases:");
			a = sc.nextInt();
			for (j = 0; j < a; j++) {
				System.out.println("Enter number of persons traveling:");
				int n = sc.nextInt();

				System.out.println("Number of persons traveling:" + n);
				System.out.println("Enter price:");
				int[] s = new int[n];

				for (i = 0; i < n; i++) {
					s[i] = sc.nextInt();
				}

				System.out.println("Price for persons:" + Arrays.toString(s));

				int min = Integer.MAX_VALUE;
				int second_min = Integer.MAX_VALUE;
				int third_min = Integer.MAX_VALUE;
				for (int x = 0; x < s.length; x++) {
					if (s[x] == min) {
						second_min = min;
					} else if (s[x] < min) {
						second_min = min;
						min = s[x];
					} else if (s[x] < second_min) {
						second_min = s[x];
					} else if (s[x] < third_min) {
						third_min = s[x];
					}

				}

				total = min + second_min + min + third_min;
				System.out.println(total);

			}

		}

		catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
