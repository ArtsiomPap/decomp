package by.htp.main.dekomp;

public class Task09 {

	public static void main(String[] args) {
		// Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно
		// простыми.
		int a = 19;
		int b = 11;
		int c = 13;

		pr(a, b, c);
	}

	public static void pr(int a, int b, int c) {
		if (a < 2 | b < 2 | c < 2) {
			System.out.println("не €вл€ютс€");
			return;
		}
		////////////////////

		double q = Math.sqrt(a);
		int a1 = 0;
		for (int i = 2; i <= q; i++) {
			if (a % i == 0) {
				a1 = 1;
			}

		}
///////////////////////////////////

		double e = Math.sqrt(b);
		int b1 = 0;
		for (int i = 2; i <= e; i++) {
			if (b % i == 0) {
				b1 = 1;
			}

		}
///////////////////////////////////

		double o = Math.sqrt(c);
		int c1 = 0;
		for (int i = 2; i <= o; i++) {
			if (c % i == 0) {
				c1 = 1;
			}

		}
///////////////////////////////////
		
		if (a1 == b1 & a1 == c1 & a1 == 0&c1==0&b1==0) {
			System.out.println("„исла взаимно простыми");
		} else {
			System.out.println("„исла не взаимно простые");
		}

	}
}