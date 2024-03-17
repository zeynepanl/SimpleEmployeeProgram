
public class Main {

	public static void main(String[] args) {
		
		
		Sirket sirket = new Sirket();
		
		Yazilimci yazilimci1 = new Yazilimci("Betul","Yılmaz","junior",9);
		Yazilimci yazilimci2 = new Yazilimci("Zeynep","Kaya","senior",7);
		Yazilimci yazilimci3 = new Yazilimci("Batuhan","Kural","intern",15);
		Personel personel1 = new Personel("Nuray","Yazici","mudur");
		Personel personel2 = new Personel("Emre","Avcı","temizlik gorevlisi");
		Personel personel3 = new Personel("Burak","Korkmaz","yazi isleri");

		sirket.yazilimciBakiye(yazilimci1);
		sirket.yazilimciBakiye(yazilimci2);
		sirket.yazilimciBakiye(yazilimci3);
		sirket.personelGider(personel1);
		sirket.personelGider(personel2);
		sirket.personelGider(personel3);

		yazilimci1.yazdir();
		yazilimci2.yazdir();
		yazilimci3.yazdir();
		personel1.yazdir();
		personel2.yazdir();
		personel3.yazdir();

		sirket.setBakiye();
		sirket.setCalisan_sayisi();


	}


}
