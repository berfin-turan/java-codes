package stringBuilder;

public class KisiFormatter {

public static String format(Kisi kisi) {
		
		StringBuilder a=new StringBuilder();
		
		a.append("Ad: ").append(kisi.getAd());
		a.append("  Soyad: ").append(kisi.getSoyad());
		a.append("  Yas: ").append(kisi.getYas());
		
		if(kisi.getYas()>=18) {
			a.append("  Yetiskin mi?: EVET");
		}
		else {
			a.append("  Yetiskin mi?: HAYIR");
		}
		return a.toString();
	}
}
