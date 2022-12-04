package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Firma;

public class KomendaDodajFirme implements Komenda {

    private DataAccessObject<Firma> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "dodaj firme";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj nazwe firmy");
        String nazwa = Komenda.scanner.nextLine();

        System.out.println("Podaj nip firmy");
        String nip = Komenda.scanner.nextLine();

        System.out.println("Podaj adres firmy");
        String adres = Komenda.scanner.nextLine();

        Firma firma = Firma.builder()
                .adres(adres)
                .nazwa(nazwa)
                .nip(nip)
                .build();

        dao.insert(firma);
    }
}
