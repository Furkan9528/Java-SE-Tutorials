package Overloading1;

public class Hamsi extends Balik {
	private String turu;

	
	
	protected Hamsi() {
		super();
	}

	protected Hamsi(int yumurtalamaMevsimi, double omuru, boolean gocDurumu, String rengi) {
		super(yumurtalamaMevsimi, omuru, gocDurumu, rengi);
	}

	protected Hamsi(String turu) {
		super();
		this.turu = turu;
	}

	protected Hamsi(int yumurtalamaMevsimi, double omuru, boolean gocDurumu, String rengi, String turu) {
		super(yumurtalamaMevsimi, omuru, gocDurumu, rengi);
		this.turu = turu;
	}
	
	@Override
	protected String balikBilgisiniVer() {
		
		return super.balikBilgisiniVer()+"Turu :"+this.turu+"\n";
	}
	
	@Override
	protected String balikBilgisiniVer(int u,double a) {
		
		return super.balikBilgisiniVer(u,a)+"Turu :"+this.turu+"\n";
	}
	
	
}
