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
    private boolean isvalid;

    @OneToOne
    @MapsId
    private User user;

    public Wallet(Long walletNum, Date emissionDate, boolean isvalid, User user) {
        this.walletNum = walletNum;
        this.emissionDate = emissionDate;
        this.isvalid = isvalid;
        this.user = user;
    }
}
