package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;


import java.util.List;

public class KomendaListaFirm implements Komenda{
    private DataAccessObject<Firma> dataAccessObject;

    public KomendaListaFirm() {
        this.dataAccessObject = new DataAccessObject<>();
    }




    @Override
    public String getKomenda() {

        return "lista firm";
    }

    @Override
    public void obsluga() {
        List<Firma> firma = dataAccessObject.findAll(Firma.class);
        firma.forEach(System.out::println);

    }
}
