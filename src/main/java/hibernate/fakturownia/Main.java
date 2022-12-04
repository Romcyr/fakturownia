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

    }
}
