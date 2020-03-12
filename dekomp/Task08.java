package by.htp.main.dekomp;

import by.htp.main.jdnomerMasivi.method;

public class Task08 {

	public static void main(String[] args) {
		// 8. Составить программу, которая в массиве A[N] находит второе по величине
		// число (вывести на печать число,
		// которое меньше максимального элемента массива, но больше всех других
		// элементов).
		int[] mas = new int[] { 2, 33, 4, -9, 8, 55};
		sortirovka(mas);
		method.print(mas);
		int z;
		z=masBezMax(mas);
		System.out.println(z);
	}

	public static void sortirovka(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length-1; j++) {
				if (mas[j] > mas[j + 1]) {
					int temp;
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}
		}

	}
	////////////////////////////////////
	
	public static int masBezMax(int[] mas) {
		int [] mas2 = new int [mas.length-1];
		int q=0;
		for(int i=0;i<mas2.length;i++) {
			mas2[i]=mas[i];
			q++;
			
		}
	
		return mas2[q-1];
	}
	
	
	
	
	
	
	
	
	
	
	
	
}