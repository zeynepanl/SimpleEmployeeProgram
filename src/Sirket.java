
public class Sirket {
	
	private double bakiye;
	private String departman;
	private int calisan_sayisi;
	
	private double toplamgider;
	private double toplambakiye;
	
	public double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye() {
		this.bakiye= toplambakiye-toplamgider;
		System.out.println("Sirketin bakiyesi:" +bakiye + "$");
	}
	
	public void yazilimciBakiye(Yazilimci yazilimci) {
		toplambakiye =toplambakiye + yazilimci.Gelir(yazilimci.getStatus());

	}
	
	public void personelGider(Personel personel) {
		toplamgider =+ personel.Gider(personel.getStatus());
	}
		
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
		
		}
	
	public int getCalisan_sayisi() {
		return calisan_sayisi;
	}
	public void setCalisan_sayisi() {
		this.calisan_sayisi=Yazilimci.yazilimciSayisi + Personel.personelSayisi;
		System.out.println("Sirketteki calisan sayisi:"+calisan_sayisi);
	}
}
