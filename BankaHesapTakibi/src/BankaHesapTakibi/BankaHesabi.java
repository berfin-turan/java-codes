package BankaHesapTakibi;

public class BankaHesabi {
	
	private int bakiye=2000;
	
	public synchronized void paraCek(String isim,int miktar) {
		if(bakiye>=miktar) {
			System.out.println(isim+" Para çekiyor...");
			try {
				Thread.sleep(1000);
			}catch(Exception a) {
				a.getMessage();
			}
			bakiye-=miktar;
			System.out.println(isim+" çekti.Kalan bakiye: "+bakiye);
		}else {
			System.out.println(isim+" :Yetersiz bakiye.Kalan bakiye: "+bakiye);
		}
		
	}

}
