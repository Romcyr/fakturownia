package hibernate.fakturownia;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.komenda.Komenda;
import hibernate.fakturownia.model.Firma;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new DataAccessObject<Firma>().findAll(Firma.class);

        List<Komenda> listaKomend = List.of(


        );
        System.out.println("Lista dostępnych komend");
        for (int i = 0; i <= listaKomend.size(); i++) {
            // wiersz po wierszu wypiszą się komendy w formie
            //1. dodaj x
            //2. dodaj y

            System.out.println((i+1) + ". " + listaKomend.get(i));

        }
        System.out.println("_______________________________________");// pusta linia oddzielająca

    }
}
