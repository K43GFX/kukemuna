
public class Tellis {
   
   public static void main (String[] param) {

   // Andmete sisestus
      double a, b, c, x, y;
      TextIO.putln ("Anna tellise m66tmed.");
      do {
         TextIO.put ("a = ");
         a = TextIO.getlnDouble();
      } while (a <= 0.);
      do {
         TextIO.put ("b = ");
         b = TextIO.getlnDouble();
      } while (b <= 0.);
      do {
         TextIO.put ("c = ");
         c = TextIO.getlnDouble();
      } while (c <= 0.);
      TextIO.putln ("Augu m66tmed.");
      do {
         TextIO.put ("x = ");
         x = TextIO.getlnDouble();
      } while (x <= 0.);
      do {
         TextIO.put ("y = ");
         y = TextIO.getlnDouble();
      } while (y <= 0.);

   // Otsustaja poole p66rdumine
      boolean tulemus = mahub (a, b, c, x, y);
      TextIO.putln ("Funktsioon tagastas tulemuse: " + tulemus);
   }

   public static boolean mahub (double a, double b, double c, 
                            double x, double y) {
      return false; // TODO!!!
   }

}

