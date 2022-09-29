import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number %2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
