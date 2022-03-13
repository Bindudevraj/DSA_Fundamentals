package Class_7;

import java.util.Scanner;

public class RecursiveReverse{
	public static void recur(int n) {
		if(n<=0)
			return;
		System.out.print(n%10);
		recur(n/10);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		scan.close();
		recur(n);

	}

}
