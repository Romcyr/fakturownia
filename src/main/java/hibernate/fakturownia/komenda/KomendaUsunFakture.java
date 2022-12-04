package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Faktura;
import hibernate.fakturownia.model.Firma;

public class KomendaUsunFakture implements Komenda {

    private DataAccessObject<Faktura> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "usun fakture";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj id faktury do usunięcia");
        String idString = Komenda.scanner.nextLine();
        Long id = Long.parseLong(idString);


        if (dao.delete(Faktura.class, id)) {
            System.out.println("Usunięto fakture");
        }else {
            System.err.println("Nie znaleziono faktury");
        }


    }
}
