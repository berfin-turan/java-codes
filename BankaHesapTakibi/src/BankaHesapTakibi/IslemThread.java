package BankaHesapTakibi;

public class IslemThread extends Thread{

	private BankaHesabi hesap;
	private String Ad;
	private int miktar;
	
	IslemThread(BankaHesabi hesap,String ad,int miktar){
		this.hesap=hesap;
		this.Ad=ad;
		this.miktar=miktar;
		
	}
	public void run() {
		hesap.paraCek(Ad, miktar);
		
	}
}
