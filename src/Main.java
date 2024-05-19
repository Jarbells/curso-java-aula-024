import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();

				if (Y == 0) {
					System.out.println("divisao impossivel");
				} 
				else {
					double result = (double) X / Y;
					System.out.printf("%.1f%n", result);
				}
			}
		} 
	}
}
