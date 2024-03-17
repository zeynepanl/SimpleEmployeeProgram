
public abstract class Employee {
	
	private String isim;
	private String soyisim;
	private String status;
	private double maas;

	
	public Employee(String isim, String soyisim, String status ) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.status=status;
		
	}
	public abstract void yazdir();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}


}
