package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;
import hibernate.fakturownia.model.Kontrahent;

public class KomendaUsunKontrahenta implements Komenda {

    private DataAccessObject<Kontrahent> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "usun kontrahenta";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj id kontrahenta do usunięcia");
        String idString = Komenda.scanner.nextLine();
        Long id = Long.parseLong(idString);


        if (dao.delete(Kontrahent.class, id)) {
            System.out.println("Usunięto kontrahenta");
        }else {
            System.err.println("Nie znaleziono kontrahenta");
        }


    }
}
