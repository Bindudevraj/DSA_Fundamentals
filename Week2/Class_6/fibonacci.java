package Class_6;

public class fibonacci {
	static int fib(int x) {
        if (x == 1)
            return 1;
        if (x == 0)
            return 0;
        return fib(x - 1) + fib(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
