package senai.com.emprestimoapi.DTOS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import senai.com.emprestimoapi.entities.Wallet;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WalletResponseDTO {
    private Date emissionDate;
    private boolean isvalid;

    public WalletResponseDTO(Wallet wallet) {
    }
}
