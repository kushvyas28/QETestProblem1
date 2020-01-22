import java.util.Scanner;

public class QETestProblem1 {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the strings : ");
		int totalScenarios = scanner.nextInt();
		for (int i = 0; i < totalScenarios; i++) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int min = 0;
			int max = 0;
			for (int j = 0; j < c1.length; j++) {
				if (c1[j] == c2[j] && (c1[j] != '?'))
					continue;
				else if ((c1[j] != c2[j]) && (c1[j] != '?' && c2[j] != '?')) {
					min = min + 1;
					max = max + 1;
				} else
					max = max + 1;
			}
			System.out.println(min + " " + max);
		}
	}
}
