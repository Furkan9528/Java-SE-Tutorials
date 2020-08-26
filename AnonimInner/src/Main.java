
public class Main {

	public static void main(String[] args) {
		IOgrenci ogrenci=new IOgrenci() {
			
			@Override 
			public void derse_gir() {
				System.out.println("Ders çalışıyorum..."); 
				
			}
			
			@Override
			public void ders_calis() {
				System.out.println("Derse giriyorum...");
				
			}
		};
		ogrenci.ders_calis();
		ogrenci.derse_gir();
		
		System.out.println("*************************************************************");
		AOgrenci ogrenci2=new AOgrenci() {
			
			@Override
			void kayit_yaptir() {
				
				System.out.println("Kayıt yapılıyor...");
				
			}
		};
		ogrenci2.kayit_yaptir();
		ogrenci2.selamla();
		
	}
	public static abstract class AOgrenci{ 
		abstract void kayit_yaptir();
		
		public void selamla() {
			System.out.println("Selamlar...");
		}
	}
	
	
	public interface IOgrenci{
		void ders_calis();
		void derse_gir();
	}
	
}
