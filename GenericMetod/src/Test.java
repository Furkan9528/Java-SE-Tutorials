
public class Test {
	public static void main(String[] args) {

		
	Sayisal sayisal1= new Sayisal(30,30,20,30);
	
	Sayisal sayisal2= new Sayisal(25,45,2,35);
	
	Sayisal birinci=birinci(sayisal1,sayisal2);
	
	EsitAgirlik esitagirlik1=new EsitAgirlik(30, 20, 40, 2);
	EsitAgirlik esitagirlik2=new EsitAgirlik(40, 10, 50, 0);
	
	EsitAgirlik birinci2= birinci(esitagirlik1,esitagirlik2);
	
	System.out.println("Birinci Sayısal öğrencinin puanı :" +birinci.puanHesapla());
	System.out.println("Birinci Esit Ağırlık öğrencinin puanı :" +birinci2.puanHesapla());

	}
	/*Integer[] integer= {1,23,45};
	Ogrenci[] ogrenci= { new Ogrenci("Furkan"),new Ogrenci("Fuat"),new Ogrenci("Ayza")};
	
	yazdir(integer);
	yazdir(ogrenci);

	
	}
	
	public static <E> void yazdir(E[] dizi) {
		for(E e:dizi)
			System.out.println(e);
	}
	*/
	public static <E extends Aday> E birinci(E e1,E e2){
		
		if(e1.puanHesapla() > e2.puanHesapla()) {
			return e1;
		}
		else {
			return e2;
		}
		
	}

}	
		
