package dik_ücgende_hipotenüs;

import java.util.Scanner;

public class Main {
	static int a,b,c;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen üçgenin kenarlarını giriniz : ");
		System.out.println("A kenarı : ");

		a = scan.nextInt();
		System.out.println("B kenarı : ");

		b = scan.nextInt();
		System.out.println("C kenarı : ");

		c = scan.nextInt();
		int u = (a+b+c) / 2;
	    var alanKare = u * (u - a)*(u - b)*(u - c);
	    var alan = Math.sqrt(alanKare);
	    var b_c = alan * 2;
	    var hipotenüs = Math.sqrt((a^2) + (c^2) - 2*(b_c));
		 System.out.println("Hipotenüs : " + hipotenüs + " " + "Üçgen uzunluk : " + u + " " + "Üçgenin alanı : " + alan); ;
	}

}
