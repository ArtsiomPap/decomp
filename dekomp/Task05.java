package by.htp.main.dekomp;

public class Task05 {

	public static void main(String[] args) {
		//  Ќаписать метод(методы) дл€ нахождени€ суммы большего и меньшего из трех чисел. 
int a = 5;
int b =72;
int c =32;
int sum;

sum=sum(a,b,c);
System.out.println(sum);
	}

	public static int sum(int q, int w,int e) {
		int sum=0;
		int max = 0;
		int min =0;
		if(q>w&q>e) {
			max=q;
		}
		if(w>q&w>e) {
			max=w;
		}
		if(e>w&e>q) {
			max=e;
		}
		//////////////////////////
		
		
		if(q<w&q<e) {
			min=q;
		}
		if(w<q&w<e) {
			min=w;
		}
		if(e<w&e<q) {
			min=e;
		}
		sum=min+max;
		return sum;
		
}
}