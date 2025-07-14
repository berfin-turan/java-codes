package arrayList;

public class MainMyListManager {

	public static void main(String[] args) {

		
		MyListManager<String> liste= new MyListManager<>();
		
		liste.addElement("Elma");
		liste.addElement("Armut");
		liste.addElement("Cilek");
		
		System.out.println(liste);
		liste.printFirstElements();

		MyListManager<Integer> liste1= new MyListManager<>();
		
		liste1.addElement(10);
		liste1.addElement(20);
		liste1.addElement(30);
		
		System.out.println(liste1);
		liste1.printFirstElements();
		
		MyListManager<Character> liste2= new MyListManager<>();
		
		liste2.addElement('A');
		liste2.addElement('B');
		liste2.addElement('C');
		
		System.out.println(liste2);
		liste2.printFirstElements();
		
	}

}
