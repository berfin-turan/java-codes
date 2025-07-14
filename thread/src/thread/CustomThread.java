package thread;

public class CustomThread extends Thread{
	String name;
	
	CustomThread(String name){
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(name+" : "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception a) {
				System.out.println("Hata oluştu: "+a.getMessage());
			}
		}
	}

}
