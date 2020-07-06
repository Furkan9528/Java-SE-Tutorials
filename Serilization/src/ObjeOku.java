import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeOku {

	public static void main(String[] args) {
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
			
			Ogrenci ogrenci1=(Ogrenci)in.readObject();
			Ogrenci ogrenci2=(Ogrenci)in.readObject();
			
			
			System.out.println("******************************");
			System.out.println(ogrenci1);
			System.out.println("******************************");
			System.out.println(ogrenci2);
			
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

	}

}
