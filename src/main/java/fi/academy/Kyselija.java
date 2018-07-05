package fi.academy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Kyselija {
 //TODO näyttää kysymykset ja kysyy vastauksen
    //TODO Kuinka kutsua haekysymykset täältäkäsin

    public void start(Connection con) throws SQLException {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tervetuloa kyselyyn");
        System.out.println("===================");
        System.out.println();
        System.out.println();

        while(true){
            //Mitä kategoriaa
            //Mitä tyyppiiä
            //Selvä -->
            //Haetaan kaikki kysymykset koskien tyyppiä ja kategoriaa.
            // ____> haetaan kysymys olio joka sisällyttää kysymykset
            System.out.println("Tässäpä kysymys");

            for(Kysymys kys : Kantakasittelija.haeKysymyksetListaan(con)){

                System.out.println(kys.getTeksti());
                for (Kysymysvaihtoehdot vaiht : kys.haeVaihtoehdotListaan(con)){
                    System.out.print(vaiht.getId() + ": ");
                    System.out.println(vaiht.getTeksti());
                }
                System.out.println();
                System.out.println("Mitä haluat. SYÖTÄ ID. PAINA JO ENTER");
                int syote = Integer.parseInt(lukija.nextLine());

                // TODO metodi --> tarkistavastaus(syote, kysymysid);

            }
            break;
        }



    }



}
