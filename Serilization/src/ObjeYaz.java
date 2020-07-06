import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjeYaz {

	public static void main(String[] args) {
		
		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			
			Ogrenci ogrenci1= new Ogrenci("Mustafa Murat" ,1234, "Bilgisayar Mühendisliği");
			Ogrenci ogrenci2=new Ogrenci("Oğuz",678,"Finansal Matematik");
			
			out.writeObject(ogrenci1);
			out.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
