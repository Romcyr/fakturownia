package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Faktura;
import hibernate.fakturownia.model.Firma;

import java.util.List;

public class KomendaListaFaktur implements Komenda{
    private DataAccessObject<Faktura> dataAccessObject;

    public KomendaListaFaktur() {
        this.dataAccessObject = new DataAccessObject<>();
    }




    @Override
    public String getKomenda() {

        return "lista faktur";
    }

    @Override
    public void obsluga() {
        List<Faktura> faktura = dataAccessObject.findAll(Faktura.class);
        faktura.forEach(System.out::println);

    }
}
