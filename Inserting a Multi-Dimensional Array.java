import java.util.Scanner;

public class GFGTestCase {
	public static void main(
		String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		int totalTestCases, eachTestCaseValues;

		totalTestCases = scanner.nextInt();

		int[][] arrayMain = new int[totalTestCases][];

		for (int i = 0; i < arrayMain.length; i++) {
			eachTestCaseValues = scanner.nextInt();
			arrayMain[i] = new int[eachTestCaseValues];
			for (int j = 0; j < arrayMain[i].length; j++) {
				arrayMain[i][j] = scanner.nextInt();
			}
		} 

		for (int i = 0; i < arrayMain.length; i++) {

			int nEvenNumbers = 0, nOddNumbers = 0;

			System.out.println(
				"TestCase " + i + " with "
				+ arrayMain[i].length + " values:");
			for (int j = 0; j < arrayMain[i].length; j++) {
				System.out.print(arrayMain[i][j] + " ");

				if (arrayMain[i][j] % 2 == 0) {
					nEvenNumbers++;
				}
				else {
					nOddNumbers++;
				}
			}
			System.out.println();

			System.out.println(
				"Total Even numbers: " + nEvenNumbers
				+ ", Total Odd numbers: " + nOddNumbers);
		}
	}
}
