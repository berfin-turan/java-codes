package ogrenciBilgiSistemi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ogrenciBilgiSistemim {

	public static void main(String[] args) {

		
String dosya="ogrenci.txt";
		
		Scanner s=new Scanner(System.in);
		
		while(true) { 
			
			System.out.println("\n Ogrenci Bilgi Sistemi\n"); 
			System.out.println("1.Ogrenci ekle"); 
			System.out.println("2.Ogrenci listele"); 
			System.out.println("3.Cikis"); 
			System.out.print("Seciminiz:"); 
			
			int secim=s.nextInt(); 
			
		switch(secim) { 
			
			case 1: 
				
				System.out.print("Ogrenci adı girin: "); 
				String ad=s.next(); 
				System.out.print("Ogrenci soyadı girin: "); 
				String soyad=s.next(); 
				
				
				 
				try(PrintWriter p=new PrintWriter(new FileWriter(dosya,true))){ 
					p.print("AD: "+ad);
					p.print("	");
					p.println("SOYAD: "+soyad);
					System.out.println("Ogrenci eklendi");
				}catch(IOException a) {
					System.out.println("Ogrenci ekleme sırasında hata oluştu");
					a.printStackTrace();
				}
				break;
			case 2:
				
				File d=new File(dosya);
				
				if(d.exists()) {
					
					try(Scanner a=new Scanner(d)){
						System.out.println("\nOgrenci listesi: ");
						while(a.hasNextLine()) {
							System.out.println(a.nextLine());
						}
					}catch(Exception e) {
						System.out.println("Listeleme sırasında hata oluştu");
						e.printStackTrace();
					}
				}else {
					System.out.println("Dosya bulunmamaktadır");
				}
				break;
			case 3:
				System.out.println("Cikis yapılıyor...");
				System.exit(0);
				break;
			default:
				System.out.println("Hatalı secim");
	
		}
		}
		
	}

}
