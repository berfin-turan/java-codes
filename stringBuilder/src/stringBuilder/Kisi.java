package stringBuilder;

public class Kisi {

	private String ad;
	private String soyad;
	private int yas;
	Kisi(String ad,String soyad,int yas){
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
		
	}
	String getAd(){
		return ad;
	}
	String getSoyad(){
		return soyad;
		
	}
	int getYas() {
		return yas;
	}
}
