package hibernate.fakturownia;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.komenda.Komenda;
import hibernate.fakturownia.komenda.KomendaDodajFirme;
import hibernate.fakturownia.model.Firma;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new DataAccessObject<Firma>().findAll(Firma.class);

        List<Komenda> listaKomend = List.of(
                new KomendaDodajFirme()


        );
        String komenda;
        do{
        System.out.println("Lista dostępnych komend");
        for (int i = 0; i < listaKomend.size(); i++) {
            // wiersz po wierszu wypiszą się komendy w formie
            //1. dodaj x
            //2. dodaj y

            System.out.println((i + 1) + ". " + listaKomend.get(i).getKomenda());

        }
        System.out.println("_______________________________________________________");// linia oddzielająca

        System.out.println("Podaj komende / wpisz 'exit' aby zakonczyc");
        komenda = Komenda.scanner.nextLine();

        for (Komenda dostepnaKomenda : listaKomend) {
            if (dostepnaKomenda.getKomenda().equalsIgnoreCase(komenda)) {
                dostepnaKomenda.obsluga();
            }

        }
        }while (!komenda.equalsIgnoreCase("exit"));
    }
}
