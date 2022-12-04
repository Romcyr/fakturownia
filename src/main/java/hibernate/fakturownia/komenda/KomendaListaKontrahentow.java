package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;
import hibernate.fakturownia.model.Kontrahent;

import java.util.List;

public class KomendaListaKontrahentow implements Komenda{
    private DataAccessObject<Kontrahent> dataAccessObject;

    public KomendaListaKontrahentow() {
        this.dataAccessObject = new DataAccessObject<>();
    }




    @Override
    public String getKomenda() {

        return "lista Kontrahentow";
    }

    @Override
    public void obsluga() {
        List<Kontrahent> kontrahent = dataAccessObject.findAll(Kontrahent.class);
        kontrahent.forEach(System.out::println);

    }
}
