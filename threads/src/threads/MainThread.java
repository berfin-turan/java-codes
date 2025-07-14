package threads;
class BankaHesabi {
    private int bakiye = 100;
 
    public synchronized void paraCek(String isim, int miktar) {
        if (bakiye >= miktar) {
            System.out.println(isim + " para çekiyor...");
            bakiye -= miktar;
            System.out.println(isim + " çekti. Kalan bakiye: " + bakiye);
        } else {
            System.out.println(isim + " yeterli bakiye yok. Kalan: " + bakiye);
        }
    }
}

public class MainThread extends Thread {
    private BankaHesabi hesap;
    private String isim;

    public MainThread(BankaHesabi hesap, String isim) {
        this.hesap = hesap;
        this.isim = isim;
    }

    public void run() {
        hesap.paraCek(isim, 75);
    }

    public static void main(String[] args) {
        BankaHesabi ortakHesap = new BankaHesabi();

        MainThread t1 = new MainThread(ortakHesap, "Berfin");
        MainThread t2 = new MainThread(ortakHesap, "Ayşe");

        t1.start();
        t2.start();
    }
}

