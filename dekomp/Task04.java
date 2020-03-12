package by.htp.main.dekomp;

import by.htp.main.jdnomerMasivi.method;

@SuppressWarnings("unused")
public class Task04 {

	public static void main(String[] args) {
		// 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
		// натуральных чисел.
		int q = 488;
		int w = 55;
		int e = 66;

		int z = nok(q, w, e);
		System.out.println(z);
	}

	public static int nok(int a, int b, int c) {

		int[] masKratChis = new int[3];

		if (a % 2 == 0) {
			masKratChis[0] = a;
		}
		if (b % 2 == 0) {
			masKratChis[1] = b;
		}
		if (c % 2 == 0) {
			masKratChis[2] = c;
		}

	
		
		int min = masKratChis[0];
		for (int i = 1; i < masKratChis.length; i++)
			if (masKratChis[i] < min&masKratChis[i]!=0) {
				min =masKratChis[i];
			}
		return min;
	}
}
