import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist=new ArrayList<String>();
/*		
		arraylist.add("furkan");
		arraylist.add("fuat");
		arraylist.add("furkan");
		arraylist.add("furkan");
		arraylist.add("fuat");
		arraylist.add("fuat");
		arraylist.add("furkan");

		String a="furkan";
		int i=0;
		for(String str : arraylist) {
			if(str.contains(a)) {
				i++;
				System.out.println(i+":"+str);
			}
			
		}
*/

		arraylist.add("Karabük");
		arraylist.add("Bartın");
		arraylist.add("Ankara");
		arraylist.add("Adana");
		arraylist.add("Giresun");
		arraylist.add("Yalova");
		arraylist.add("Eskişehir");
		
		//Sıralama
		for(String counter : arraylist) {
			System.out.println(counter);
		}
		System.out.println("_________________________");
		System.out.println();
		
		//Ters Sıralama
		for(int i=arraylist.size()-1; i>-1; i--) {
			
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("_________________________");
		System.out.println();
		
		//Düz sıralama
		java.util.Collections.sort(arraylist);
		for(String counter : arraylist) {
			System.out.println(counter);
		}
		
		
	}

}
