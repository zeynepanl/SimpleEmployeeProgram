
public class Personel extends Employee{
	public static int personelSayisi=0;

	public Personel(String isim, String soyisim, String status) {
		super(isim, soyisim, status);
		personelSayisi ++;
	}
	public double Gider(String status) {
		
		if(status.equals("mudur")) {
			setMaas(4000);
			return getMaas();
		}
		else if(status.equals("yazi isleri")) {
			setMaas(2500);
			return getMaas();
		}
		else if(status.equals("temizlik gorevlisi")) {
			setMaas(2000);
			return getMaas();
		}
		return 0;
	}

	public void yazdir() {
		System.out.println("Calisanin ismi:"+getIsim()+"\n"
				+"Calisanin soyismi:" +getSoyisim()+"\n"
				+"Calisanin statusu:" +getStatus()+"\n"
				+"Maasi:" + getMaas() +"$"+"\n");
	}
	

}
