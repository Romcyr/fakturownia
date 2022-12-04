package hibernate.fakturownia.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private LocalDate nip;
    private LocalDate adres;

    @OneToMany(mappedBy = "firma")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Faktura> faktury;

}

