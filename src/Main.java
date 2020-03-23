import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> cases = new ArrayList<Integer>();
		cases.add(325684941);
		cases.add(35456218);
		cases.add(2546987);
		cases.add(914557);
		cases.add(81655);
		cases.add(1190);
		cases.add(581);
		cases.add(20);
		cases.add(9);
		List<Integer> counters = new ArrayList<Integer>();
		for (int n : cases) {

			bereken(n);
		}

	}

	public static void bereken(int n) {
		int c = 0;
		int temp;
		List<Integer> row = new ArrayList<Integer>();
		row.add(n);
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
			row.add(n);
		}
		System.out.println(row);
		System.out.println(c);

	}
}
