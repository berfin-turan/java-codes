package stringBuilder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.print("Adinizi Girin: ");
		String ad=s.nextLine();
		
		System.out.print("Soyadinizi Girin: ");
		String soyAd=s.nextLine();
		
		System.out.print("Yasinizi Girin: ");
		int yas=s.nextInt();
		
		Kisi kisi=new Kisi(ad,soyAd,yas);
		
		String sonuc=KisiFormatter.format(kisi);
		System.out.println(sonuc);
		s.close();

	}

}
