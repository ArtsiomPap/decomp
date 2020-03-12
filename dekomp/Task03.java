package by.htp.main.dekomp;

public class Task03 {

	public static void main(String[] args) {
		// 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. 
int a=44;
int b=6;
int c=16;
int e=18;

int z = nod(a,b,c,e);
System.out.println(z);
	}
public static int nod (int q,int w,int e,int r) {
	int nod=0;
	if(q<w&q<e&q<r) {
		nod=q;
	}
	if(w<q&w<e&w<r) {
		nod=w;
	}
	if(e<q&e<w&e<r) {
		nod=e;
	}
	if(r<q&r<e&r<w) {
		nod=r;
	}
	return nod;
}
}
