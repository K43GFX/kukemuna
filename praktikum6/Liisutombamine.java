package praktikum6;

public class Liisutombamine {
	public static void main(String[] args) {
		System.out.println("Sisesta inimeste arv: ");
		int arv = TextIO.getInt();
		//System.out.println(arv);
		int suvalinearv = Meetodid.suvalineArv(1, arv);
		System.out.println(suvalinearv);
	}
}
