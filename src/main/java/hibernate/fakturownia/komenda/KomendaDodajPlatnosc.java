package hibernate.fakturownia.komenda;

import hibernate.fakturownia.database.DataAccessObject;
import hibernate.fakturownia.model.Faktura;
import hibernate.fakturownia.model.FormaPlatnosci;
import hibernate.fakturownia.model.Platnosc;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class KomendaDodajPlatnosc implements Komenda {

    private DataAccessObject<Platnosc> dao = new DataAccessObject<>();

    @Override
    public String getKomenda(){
        return "dodaj platnosc";
    }
    @Override
    public void obsluga(){

        System.out.println("Podaj kwotę platnosci");
        String kwota = Komenda.scanner.nextLine();

        System.out.println("Podaj formę platności");
        String formaPlatnosci = Komenda.scanner.nextLine();


        System.out.println("Data realizacji");
        LocalDateTime czasRealizacji = LocalDateTime.now();

        Platnosc platnoscNow = Platnosc.builder()
                .kwota(Double.valueOf(kwota))
                .formaPlatnosci(FormaPlatnosci.valueOf(formaPlatnosci))
                .dataRealizacji(LocalDate.from(czasRealizacji))
                .build();

        dao.insert(platnoscNow);


    }
}
