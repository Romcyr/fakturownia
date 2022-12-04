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

public class Kontrahent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private LocalDate nip;
    private LocalDate adres;

    @OneToMany(mappedBy = "kontrahent")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Faktura> faktury;
    
}

