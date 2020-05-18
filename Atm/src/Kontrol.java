import java.util.Scanner;

public class Kontrol {

	public boolean giris(Hesap hesap) {
		Scanner scanner=new Scanner(System.in);
		String kullanici_adi;
		String parola;
		
		System.out.print("Kisi Adı : ");
        kullanici_adi = scanner.nextLine();
   
		if(hesap.getKullanici_adi().equals(kullanici_adi)) {
			return true;
		}
		else
			return false;
	}	
}
