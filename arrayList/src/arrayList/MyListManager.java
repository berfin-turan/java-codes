package arrayList;

import java.util.ArrayList;

public class MyListManager<T> {
	
private ArrayList<T> list= new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void printElements() {
		if(list.isEmpty()) {
			System.out.println("Liste bos!!");
		}else {
			System.out.println(list);
		}
	}
	public void printFirstElements() {
		if(list.isEmpty()) {
			 System.out.println("Liste bos!!");
		}else {
			 System.out.println("Listenin ilk elemani: " +list.get(0));
		}
	}
	@Override
	public String toString() {
		return  list.toString();
	}

}
