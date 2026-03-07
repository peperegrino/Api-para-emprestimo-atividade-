package senai.com.emprestimoapi.DTOS;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import senai.com.emprestimoapi.entities.Isvalid;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WalletRequestDTO {

    @NonNull
    private Date emissionDate;

    @NotBlank
    private Isvalid isvalid;
}
