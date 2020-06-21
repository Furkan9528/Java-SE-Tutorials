import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		
		//File file=new File("dosya.txt");
		 
		try {
			
			fos=new FileOutputStream("dosya.txt");
			
			fos.write(65);
			fos.write(74);
			
			String s="Furkan KARA";
			byte[] s_array=s.getBytes();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception oluştu...");
		} catch (IOException e) {
			System.out.println("Dosyaya yazılırken bir hata oluştu.");
			
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatıllırken bir hata oluştu...");
			}
		}
	}
}
