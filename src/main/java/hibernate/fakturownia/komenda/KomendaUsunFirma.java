package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;

public class KomendaUsunFirma implements Komenda {

    private DataAccessObject<Firma> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "usun firme";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj id firmy do usunięcia");
        String idString = Komenda.scanner.nextLine();
        Long id = Long.parseLong(idString);


        if (dao.delete(Firma.class, id)) {
            System.out.println("Usunięto firmę");
        }else {
            System.err.println("Nie znaleziono firmy");
        }


    }
}
