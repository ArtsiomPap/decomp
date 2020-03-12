package by.htp.main.dekomp;

public class Task06 {

	public static void main(String[] args) {
		//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. 
int a=5;
double pl=s(a);
System.out.println(pl);
	}
public static double s (int q) {
	double s = 3*Math.sqrt(3)*Math.pow(q, 2)/2;
	
	return s;
}
}
