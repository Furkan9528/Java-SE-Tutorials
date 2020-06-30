import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class HashMapMain {
	
	public static <K, V> void main(String[] args) {
		
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		
		hashMap.put(10,"Java");
		hashMap.put(30,"Python");
		hashMap.put(50,"Php");
		hashMap.put(20,"Php");
		hashMap.put(20, "Php");
	
		hashMap.put(50,"JavaScript");
		

		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(50));
		System.out.println(hashMap.get(10));
		
		for(Map.Entry<Integer, String > entry : hashMap.entrySet() ) {
			
			System.out.println("Anahtar :" + entry.getKey() + "------> Değer:" + entry.getValue() );
		}
			

		
		
		
	}
}
