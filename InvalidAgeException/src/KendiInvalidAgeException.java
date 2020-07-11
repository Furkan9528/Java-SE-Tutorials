import java.io.IOException;

public class KendiInvalidAgeException extends IOException {

	public KendiInvalidAgeException(String message) {
		super(message);
	}
	
	
	@Override
	public void printStackTrace(){
		System.out.println("Bu bir invalid karakter.");
	}
	
	
	
}
