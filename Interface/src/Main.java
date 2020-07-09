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
		
		Deney.baglantiKur dene= new Deney().new baglantiKur();
		dene.baglantiKuru();
	}
	public interface IOgrenci{
		void ders_calis();
		void derse_gir();
	}
	
	

	
	
	
}	
