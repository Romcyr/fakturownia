package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Faktura;
import hibernate.fakturownia.model.Firma;

import java.time.LocalDate;

public class KomendaDodajFakture implements Komenda {

    private DataAccessObject<Faktura> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "dodaj fakturę";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj numer faktury");
        String numer = Komenda.scanner.nextLine();

        System.out.println("Podaj termin platnosci");
        LocalDate terminPlatnosci = LocalDate.now();

        System.out.println("Podaj kwotę");
        Double kwota = Double.valueOf(Komenda.scanner.nextLine());

        Faktura faktura = Faktura.builder()
                .numerFaktury(numer)
                .terminPlatnosci(terminPlatnosci)
                .kwota(kwota)
                .build();



        dao.insert(faktura);
    }
}
