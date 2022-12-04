package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;
import hibernate.fakturownia.model.Platnosc;

public class KomendaUsunPlatnosc implements Komenda {

    private DataAccessObject<Platnosc> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "usun platnosc";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj id formy platnosci do usunięcia");
        String idString = Komenda.scanner.nextLine();
        Long id = Long.parseLong(idString);


        if (dao.delete(Platnosc.class, id)) {
            System.out.println("Usunięto firmę");
        }else {
            System.err.println("Nie znaleziono firmy");
        }


    }
}
