package senai.com.emprestimoapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long walletNum;

    private Date emissionDate;
    private Isvalid isvalid;

    @OneToOne
    @MapsId
    private User user;

    public Wallet(@NonNull Date emissionDate, @NotBlank Isvalid isvalid) {
    }
}
