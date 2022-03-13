package Class_8;

import java.util.Scanner;

public class RecursiveGCD {
	public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the first number");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number");
        int n2 = scan.nextInt();
        scan.close();
        int gcd = gcd(n1, n2);

        System.out.println("G.C.D of " + n1+ "," + n2 + " is " +gcd);
    }
}
