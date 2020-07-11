import java.util.Scanner;

public class Main {

	public static void mekan_control(int yas) throws KendiInvalidAgeException {
		
		if(yas<18) {
			throw new KendiInvalidAgeException("Invalid Age");
		}
		else {
			System.out.println("Mekana Hoşgeldiniz...");
		}
	}
	
	
	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);	
		System.out.println("Lütfen yas girin :");
		
		int yas=scanner.nextInt();
		
		try {
			mekan_control(yas);
		}catch(KendiInvalidAgeException e) {
			e.printStackTrace();
		}
		
		
	}
}
