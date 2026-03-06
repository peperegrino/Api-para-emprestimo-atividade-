package senai.com.emprestimoapi.DTOS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponseDTO {
    private Date loanDate;
    private Date devolutionDate;
}
