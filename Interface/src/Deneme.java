
public interface Deneme {

	public static void derse_gir() {
		System.out.println("Ders çalışıtyorum");
	}
	public default void ders_calis() {
		System.out.println("Deneme");
	}
	void baglantiKur();
}
