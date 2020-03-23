import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	bereken2(93372036854775809L);

	}

	public static void bereken2(long n) {
		long c = 0L;
		long temp;
		System.out.println(n);
		while (n != 1) {
			if (n % 2 == 0) {
				temp = n / 2;
				n = temp;
				c++;
			} else {
				temp = (3 * n) + 1;
				n = temp;
				c++;
			}
			System.out.println(n);
		}

		System.out.println(c);

	}
}
