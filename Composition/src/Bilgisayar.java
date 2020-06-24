
public class Bilgisayar {
	
	private Kasa kasa;
	private Monitor monitor;
	private Anakart anakart;
	
	
	public Bilgisayar(Kasa kasa, Monitor monitor, Anakart anakart) {
		super();
		this.kasa = kasa;
		this.monitor = monitor;
		this.anakart = anakart;
	}
	
	public Kasa getKasa() {
		return kasa;
	}
	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Anakart getAnakart() {
		return anakart;
	}
	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
	
}
