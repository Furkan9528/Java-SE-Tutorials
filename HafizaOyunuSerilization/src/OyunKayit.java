import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit {
	public static void oyunKaydet(Kart[][] kartlar) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
			System.out.println("Oyun kayıt ediliyor");
			
			out.writeObject(kartlar);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Kart[][] kayittanAl(){
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
			
			Kart[][] cikti = ( Kart[][])in.readObject();
			
			return cikti;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
