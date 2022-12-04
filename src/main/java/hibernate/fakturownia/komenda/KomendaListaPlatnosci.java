package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;
import hibernate.fakturownia.model.Platnosc;

import java.util.List;

public class KomendaListaPlatnosci implements Komenda{
    private DataAccessObject<Platnosc> dataAccessObject;

    public KomendaListaPlatnosci() {
        this.dataAccessObject = new DataAccessObject<>();
    }




    @Override
    public String getKomenda() {

        return "lista platnosci";
    }

    @Override
    public void obsluga() {
        List<Platnosc> platnoscs = dataAccessObject.findAll(Platnosc.class);
        platnoscs.forEach(System.out::println);

    }
}
