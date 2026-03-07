package senai.com.emprestimoapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date loanDate;
    private Date devolutionDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Loan(@NotBlank Date loanDate, @NotBlank Date devolutionDate) {
    }
}

