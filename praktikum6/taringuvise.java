package praktikum6;

public class taringuvise {

	int arvuti = Meetodid.taringuVise() + Meetodid.taringuVise();
	int mangija = Meetodid.taringuVise() + Meetodid.taringuVise();
	
	if(arvuti < mangija) {
		System.out.println("Mängija võitis!");
	} else {
		System.out.println("Arvuti võitis!");
	}
}
