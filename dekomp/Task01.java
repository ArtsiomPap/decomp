package by.htp.main.dekomp;

public class Task01 {

	public static void main(String[] args) {
		// 1. Треугольник задан координатами своих вершин. Написать метод для вычисления
		// его площади.
		double x1 = 6;
		double x2 = 4;
		double x3 = 3;

		double y1 = 6;
		double y2 = 4;
		double y3 = 3;

		double z = pl(x1, x2,x3,y1,y2,y3);
		System.out.println(z);
	}

	public static double pl(double x1,double x2,double x3,double y1,double y2,double y3) {
		double AB;
		double BC;
		double AC;

		AB =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		BC =  Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		AC =  Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		double p = AB+BC+AC;
		double pol=p/2;
		double s = Math.sqrt(pol*(pol-AB)*(pol-BC)*(pol-AC));
		return s;
	}

}