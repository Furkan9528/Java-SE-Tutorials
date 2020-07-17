package Overloading1;

public class Calistir {
	public static void main(String[] args) {
		Hamsi hamsi =new Hamsi(2, 2.3, false, "kirmizi", "Dogu Karadeniz");
		
		System.out.print(hamsi.balikBilgisiniVer());
		
		hamsi =new Hamsi(2, 2.3, true, "Bordo", "Bati Karadeniz");
		
		System.out.print(hamsi.balikBilgisiniVer(4, 5.4)); 
	}

}
