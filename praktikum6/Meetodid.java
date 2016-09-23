package praktikum6;

public class Meetodid {

	
	public static int kasutajaSisestus(String kysimus, int min, int max) {
		while (true) {
			System.out.println(kysimus);
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max) {
				return sisestus;
			} else {
				System.out.println("Ei sobi see arv!");
			}
		}
	}
	
	public static int kasutajaSisestus(int min, int max) {
		String kysimus = "Sisesta arv vahemikus " + min + " kuni " + max;
		return kasutajaSisestus(kysimus, min, max);
	}
	
	public static int kuup(int i) {
		return (int) Math.pow(i, 3);		
	}

	public static int suvalineArv(int min, int max) {
		int vahemik = max - min + 1;
		return min + (int) (Math.random() * vahemik);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(suvalineArv(-5, 5));
		}
	}
	
	public static int taringuVise() {
		
		return suvalineArv(1, 6);
	}
}