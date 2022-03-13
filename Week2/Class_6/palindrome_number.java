package Class_6;

import java.util.Scanner;

public class palindrome_number {
	public static int palin(int n, int temp){
        if (n == 0)
        return temp;
        temp = (temp * 10) + (n % 10);
        return palin(n / 10, temp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = palin(n, 0);
        if (temp == n){
        System.out.println("YES");
        }else{
        System.out.println("NO" );
        }
    }
}
