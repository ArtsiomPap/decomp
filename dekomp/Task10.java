package by.htp.main.dekomp;

import by.htp.main.jdnomerMasivi.method;

public class Task10 {
	
//10. Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9.
	public static void main(String[] args) {
		
		int [] ch = new int [9];
		for (int i =0;i<ch.length;i++) {
			ch[i]=i;
			
		}
		nechet(ch);
		method.print(ch);
	}
	
	
public static void nechet (int [] masPr) {
	for (int i =0;i<masPr.length;i++) {
		if(masPr[i]%2==0) {
			masPr[i]=0;
		}
	}
	

	
}
	
}
