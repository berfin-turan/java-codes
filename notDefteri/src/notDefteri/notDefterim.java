package notDefteri;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class notDefterim {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("\n\nNot Defteri");
			System.out.println("1.Not ekle");
			System.out.println("2.Not oku");
			System.out.println("3.Çıkış");
			System.out.println("Seciminiz:");
			int secim=input.nextInt();
			
		switch(secim) {
			case 1: 
				System.out.println("Not girin: ");
				input.nextLine();
				String not= input.nextLine();
				
				try (PrintWriter yazıcı=new PrintWriter(new FileWriter("notlar.txt",true))){
					yazıcı.println(not);
					System.out.println("Not kaydedildi");
				}
				catch(Exception e){
					System.out.println("hata oluştu");
					e.printStackTrace();
				}
				break;
				
			case 2:
				
				File d=new File("notlar.txt");
				
				if(d.exists()) {
					try(Scanner o=new Scanner(d)){
						System.out.println("Notlar:\n");
						while(o.hasNext()) {
							System.out.println(o.nextLine());
						}
					}
					catch(Exception e){
						System.out.println("Dosya okumada hata oluştu");
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Dosyada not bulunmamaktadır");
				}
				break;
			case 3:
				System.out.println("Cikis yapılıyor...");
				input.close();
				System.exit(0);
				break;
				
			default:
			    System.out.println("Geçersiz giriş.Lütfen geçerli bir sayı girin.");
					
		}
		}
		
	}

}
