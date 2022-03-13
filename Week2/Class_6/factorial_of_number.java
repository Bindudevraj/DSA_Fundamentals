package Class_6;

import java.util.Scanner;

public class factorial_of_number {
	public static int _fact(int n) {
        if (n == 1)
            return 1;
        return n * _fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = _fact(n);
        System.out.println(res);
    }
}
