package BankaHesapTakibi;

public class Main {

	public static void main(String[] args) {

		BankaHesabi hesap=new BankaHesabi();
		
		IslemThread t1=new IslemThread(hesap,"Berfin",100);
		IslemThread t2=new IslemThread(hesap,"Asmin",200);
		IslemThread t3=new IslemThread(hesap,"Yusuf",50);

		t1.start();
		t2.start();
		t3.start();
		
	}

}
