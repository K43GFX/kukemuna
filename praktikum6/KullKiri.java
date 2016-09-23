package praktikum6;

public class KullKiri {
	public static void main(String[] args) {

		int kasutajaArvamus = Meetodid.kasutajaSisestus("Kull (0) või kiri (1)?", 0, 1);
		int myndiVise = Math.random() > 0.5 ? 1 : 0;

		System.out.println("Kasutaja sisestas: " + kasutajaArvamus);
		System.out.println("Mündivise: " + myndiVise);
		
		// TODO: kas kasutaja arvas ära või mitte?
		if(kasutajaArvamus == myndiVise) {
			System.out.println("Arvasid ära!");
		} else {
			System.out.println("Panid mööda!");
		}
	}
}
