package Overloading1;

public class Balik {
	private int yumurtalamaMevsimi;
	private double omuru;
	private boolean gocDurumu;
	private String rengi;
	
	

	public Balik() {
		super();
		// TODO Auto-generated constructor stub
	}


		public Balik(int yumurtalamaMevsimi, double omuru, boolean gocDurumu, String rengi) {
		super();
		this.yumurtalamaMevsimi = yumurtalamaMevsimi;
		this.omuru = omuru;
		this.gocDurumu = gocDurumu;
		this.rengi = rengi;
	}


	public int getYumurtalamaMevsimi() {
		return yumurtalamaMevsimi;
	}


	public void setYumurtalamaMevsimi(int yumurtalamaMevsimi) {
		this.yumurtalamaMevsimi = yumurtalamaMevsimi;
	}


	public double getOmuru() {
		return omuru;
	}


	public void setOmuru(double omuru) {
		this.omuru = omuru;
	}


	public boolean isGocDurumu() {
		return gocDurumu;
	}


	public void setGocDurumu(boolean gocDurumu) {
		this.gocDurumu = gocDurumu;
	}


	public String getRengi() {
		return rengi;
	}


	public void setRengi(String rengi) {
		this.rengi = rengi;
	}
	
	
	protected String balikBilgisiniVer() {
		
		String gocDurumBilgisi,mevsimBilgisi;
		
		if(this.gocDurumu==false) {
			gocDurumBilgisi="Gocmen Degil";
		}
		else {
			gocDurumBilgisi="Gocmen";
		}
		
		switch(this.yumurtalamaMevsimi) {
		case 1: mevsimBilgisi="İlkbahar"; break;
		case 2: mevsimBilgisi="yaz"; break;
		case 3: mevsimBilgisi="Sonbahar"; break;
		case 4: mevsimBilgisi="Kis"; break;
		
		default: mevsimBilgisi="ilkbahar"; break;
		
		
		}
		
		String sonuc="Goc Durumu :" +gocDurumBilgisi+"Rengi :"+this.rengi
				+"Omru :"+this.omuru+
				"Yumurtlama Mevsimi :" +mevsimBilgisi+"\n";
				
		
		
		
		return sonuc;
		
	}
	
	protected String balikBilgisiniVer(double uzunlugu,int agirligi) {
		
		String gocDurumBilgisi,mevsimBilgisi;
		
		if(this.gocDurumu==false) {
			gocDurumBilgisi="Gocmen Degil";
		}
		else {
			gocDurumBilgisi="Gocmen";
		}
		
		switch(this.yumurtalamaMevsimi) {
		case 1: mevsimBilgisi="İlkbahar"; break;
		case 2: mevsimBilgisi="yaz"; break;
		case 3: mevsimBilgisi="Sonbahar"; break;
		case 4: mevsimBilgisi="Kis"; break;
		
		default: mevsimBilgisi="ilkbahar"; break;
		
		
		}
		
		String sonuc="\nGoc Durumu :" +gocDurumBilgisi
						+"\n Rengi :"+this.rengi
						+"\nOmru :"+this.omuru
						+"\nYumurtlama Mevsimi :" +mevsimBilgisi
						+"\nUzunlugu :"+ uzunlugu
						+"\nAgirligi :" +agirligi
						+"\n";
			
		
		return sonuc;
		
	}
protected String balikBilgisiniVer(int uzunlugu,double agirligi) {
		
		String gocDurumBilgisi,mevsimBilgisi;
		
		if(this.gocDurumu==false) {
			gocDurumBilgisi="Gocmen Degil";
		}
		else {
			gocDurumBilgisi="Gocmen";
		}
		
		switch(this.yumurtalamaMevsimi) {
		case 1: mevsimBilgisi="İlkbahar"; break;
		case 2: mevsimBilgisi="yaz"; break;
		case 3: mevsimBilgisi="Sonbahar"; break;
		case 4: mevsimBilgisi="Kis"; break;
		
		default: mevsimBilgisi="ilkbahar"; break;
		
		
		}
		
		String sonuc="\n Goc Durumu :" +gocDurumBilgisi+"Rengi :"+this.rengi
					+"\n Omru :"+this.omuru
					+"\n Yumurtlama Mevsimi :" +mevsimBilgisi
					+"\n Uzunlugu :"+ uzunlugu
					+"\n Agirligi :" +agirligi
					+"\n";
					
		return sonuc;
		
	}
	

}
