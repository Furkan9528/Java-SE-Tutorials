
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm atm=new Atm();
		
		Hesap hesap=new Hesap("Furkan KARA","12345",2000);
		Hesap hesap1=new Hesap("Fuat KARA","12345",2000);
		Hesap hesap2=new Hesap("Zeynep KARA","12345",2000);
		
		atm.calis(hesap,hesap1);
		
		System.out.println("Programdan Çıkılıyor...");
        
	}

}
