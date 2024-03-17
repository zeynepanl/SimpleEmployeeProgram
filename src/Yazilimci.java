
public class Yazilimci extends Employee {
	
	private double calisma_suresi;
	public static int yazilimciSayisi=0;

	public Yazilimci(String isim, String soyisim,String status , double calisma_suresi) {
		super(isim, soyisim,status);
		this.calisma_suresi=calisma_suresi;
		yazilimciSayisi++;
	}
	
	public double Gelir(String status) {
		
		if(status.equals("junior")) {
			setMaas(1700);
			double gelir1 = (calisma_suresi + (calisma_suresi*115))*200;
			return gelir1 - getMaas();
		}
		
		else if(status.equals("senior")){
			double gelir2 = (calisma_suresi + (calisma_suresi*130))*200;
			setMaas(3500);
			return gelir2 - getMaas();
		}
		
		else if(status.equals("intern")) {
			double gelir3 = (calisma_suresi + (calisma_suresi*150))*200;
			return gelir3;

		}
		return 0;
	}
	
	public void yazdir() {
		System.out.println("Calisanin ismi:"+getIsim()+"\n"
				+"Calisanin soyismi:" +getSoyisim()+"\n"
				+"Calisanin statusu:" +getStatus()+"\n"
				+"Calisma suresi:" +calisma_suresi+" saat"+"\n"
				+"Maasi:" + getMaas() +"$"+"\n");
	}
	
	
	
	

}
