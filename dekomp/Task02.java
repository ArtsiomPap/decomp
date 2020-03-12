package by.htp.main.dekomp;

public class Task02 {

	public static void main(String[] args) {
		// 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: 
		int q=4;
		int z =2;
		
		int k;
		k=(q*z)/nod(q,z);
		nok(q,z);
		System.out.println(k);
	}
public static int nok (int a,int b) {
	int nok;
	if(a<b) {
		nok=a;
	}else {
	nok=b;
	}
	return nok;
	
}

public static int nod (int a,int b) {
	int nod;
	if(a>b) {
		nod=a;
	}else {
	nod=b;
	}
	return nod;
	
}
}
