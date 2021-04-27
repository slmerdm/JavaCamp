/**
 * gun1
 */
public class gun1 {
    public static void main(String[] args) {
        String internetSubeButonu ="İnternet Şubesi";
        double dolarDun = 8.20;
        double dolarBugun= 8.20;
        int vade= 36;
        boolean dusutuMu= false;
        System.out.println(internetSubeButonu);

        if(dolarBugun<dolarDun) {
            System.out.println("Dolar düştü resmi");

        }
        else if (dolarBugun>dolarDun){
            System.out.println("Dolar yükseldi resmi");

        }
        else{
            System.out.println("Dolar eşittir resmi");

        }



        String[] krediler = 
            {
                "Hızlı kredi",
                "Mutlu emekli kredisi",
                "Konut kredisi",
                "Çiftçi kredisi",
                "Msb kredisi",
                "Meb kredisi",
                "Kültür bakanlığı kredisi"

            };
            //foreach
//         for(String kredi: krediler) {
//             System.out.println(kredi);
// for(int i=0; i<krediler.length; i++){}  FARKLI KULLANIM
//         }
        for(int i=0; i<krediler.length;i++) {
            //System.out.println(krediler[0]);  //7 kere Hızlı Kredi yazdırır.
            System.out.println(krediler[i]);  // listeyi yazdırır.
        }
    }
}