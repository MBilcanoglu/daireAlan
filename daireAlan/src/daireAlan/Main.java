package daireAlan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double yariCap, merkezAciOlcusu, pi=3.14,alan;
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yari �ap�n� giriniz: ");
		yariCap=input.nextDouble();
		System.out.print("Dairenin merkez a�� �l��s�n� giriniz: ");
		merkezAciOlcusu=input.nextDouble();
		alan=(pi*(yariCap*yariCap)*merkezAciOlcusu)/360;
		System.out.println("De�erleri girilen dairenin alan�: "+alan);
	}

}
