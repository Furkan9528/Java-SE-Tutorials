import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeYaz {

	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Mustafa Murat" , 1234 ,"Bilgisayar Mühedindisliği");
		Ogrenci ogrenci2 = new Ogrenci("Oguz", 678 , "Finansal Matematik");
		Ogrenci ogrenci3 = new Ogrenci("Mehmet" ,123 ,"Bilgisayar Mühendisliği");
		
		Ogrenci[] ogrenci_array= { ogrenci1, ogrenci2, ogrenci3 };
		ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
		
		
 		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			
	
			out.writeObject(ogrenci_array);
			out.writeObject(ogrenci_list);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
