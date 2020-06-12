import java.util.Arrays;
import java.util.Scanner;

public class Dizi {

	public static int[] array_doldur(int sayi) {
		Scanner scanner=new Scanner(System.in);
		
		int[] cikti=new int[sayi];
		
		for(int i=0; i<sayi; i++) {
			cikti[i]=scanner.nextInt();
		}
		
		return cikti;
	}
	public static void arraybastir(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("Element "+i+": "+a[i] );
		}
	}
	
	public static void array(int[] array) {
		
      Arrays.sort(array);
      arraybastir(array);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=array_doldur(5);
		arraybastir(a);
		array(a);
	}

}
