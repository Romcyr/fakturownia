package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;
import hibernate.fakturownia.model.Kontrahent;

public class KomendaDodajKontrahenta implements Komenda {

    private DataAccessObject<Kontrahent> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "dodaj firme";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj nazwe kontrahenta");
        String nazwa = Komenda.scanner.nextLine();

        System.out.println("Podaj nip kontrahenta");
        String nip = Komenda.scanner.nextLine();

        System.out.println("Podaj adres kontrahenta");
        String adres = Komenda.scanner.nextLine();

        Kontrahent kontrahent = Kontrahent.builder()
                .adres(adres)
                .nazwa(nazwa)
                .nip(nip)
                .build();

        dao.insert(kontrahent);
    }
}
