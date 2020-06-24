
public class Test {
	
	public static void main(String[] args) {
		
		Resolution resolution=new Resolution(1920,1080);
		
		Monitor monitor = new Monitor("Ryzen7","Toshiba","13",resolution);
		
		Kasa kasa=new Kasa("Shadow Blade","Shadow","Temperli Cam");
		
		Anakart anakart=new Anakart("B250-PRO","Asus",10,"Windows 10");
		
		Bilgisayar pc=new Bilgisayar(kasa,monitor,anakart);
		
		pc.getKasa().bilgisayari_ac();
		pc.getAnakart().isletim_sistemi_yukle("Ubuntu");
		pc.getMonitor().monitoru_kapat();
	}
}
